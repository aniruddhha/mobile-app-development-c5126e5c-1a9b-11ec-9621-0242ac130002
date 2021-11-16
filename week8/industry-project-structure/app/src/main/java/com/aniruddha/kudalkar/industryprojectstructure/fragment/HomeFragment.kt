package com.aniruddha.kudalkar.industryprojectstructure.fragment

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.aniruddha.kudalkar.industryprojectstructure.MainActivity
import com.aniruddha.kudalkar.industryprojectstructure.adapter.HomeAdapter
import com.aniruddha.kudalkar.industryprojectstructure.databinding.FragmentHomeBinding
import com.aniruddha.kudalkar.industryprojectstructure.dialog.YesNoDialogMaker
import com.aniruddha.kudalkar.industryprojectstructure.repository.RemoteOrganizationRepository
import com.aniruddha.kudalkar.industryprojectstructure.toast.ToastUtil
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    val binding get() = _binding!!

    private val scp : CoroutineScope = CoroutineScope(Dispatchers.IO)

    @Inject
    lateinit var repository: RemoteOrganizationRepository

    private val vm : HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        (activity as MainActivity).supportActionBar?.apply {
            title = "Workspaces"
            this.setDisplayHomeAsUpEnabled(false)
        }

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        vm.item.observe(viewLifecycleOwner) {
            val id = it.organization.organizationId ?: ""
            when(it.operation) {
                "edit" ->  performUpdateOperation(id)
                "delete" -> performDeleteOperation(id)
            }
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecycler()
    }

    private fun initRecycler() {

        val layoutManager = LinearLayoutManager(requireContext())
        binding.recOrg.layoutManager = layoutManager

        binding.recOrg.addItemDecoration(
            DividerItemDecoration(requireContext(), layoutManager.orientation)
        )

        fetchOrganizationsFromServer()
    }

    private fun fetchOrganizationsFromServer() {
        scp.launch {
            val result = repository.organizations()
            if(result.isSuccess) {
                val organizations = result.getOrThrow()

                withContext(Dispatchers.Main) {
                    val adapter = HomeAdapter(
                        requireContext(),
                        organizations,
                        vm
                    )
                    binding.recOrg.adapter = adapter
                }
            }
        }
    }

    private fun onDeleteWorkspace(id : String) {
        Log.i("@ani", "Id - ${id}")
        scp.launch {
            val result = repository.deleteOrganization(id)
            result.onSuccess {
                Log.i("@ani", "Workspace Deleted Successfully")
                ToastUtil.coroutineToast(requireContext(), "Deleted Successfully")
            }
            result.onFailure {
                Log.i("@ani", it.toString())
                ToastUtil.coroutineToast(requireContext(), "Problem In Deleting")
            }
        }
    }

    private fun onUpdateWorkspace(id : String, nm : String, desc : String) {
        Log.i("@ani", "id - $id, nm - $nm, desc - $desc")
        scp.launch {
            val result = repository.updateOrganization(id, nm, desc)
            result.onSuccess {
                ToastUtil.coroutineToast(requireContext(), "Updated Successfully")
            }
            result.onFailure {
                ToastUtil.coroutineToast(requireContext(), "Problem In Updating")
            }
        }
    }

    private fun performDeleteOperation(id : String) {
        YesNoDialogMaker.createSimpleYesNoDialog(
            requireContext(),
            "Do you want to delete Workspace ?",
        ) { di, wh ->
            when(wh) {
                DialogInterface.BUTTON_POSITIVE -> onDeleteWorkspace(id)
                DialogInterface.BUTTON_NEGATIVE -> di.dismiss()
            }
        }.show()
    }

    private fun performUpdateOperation(id : String) {
        YesNoDialogMaker.createInputYesNoDialog(
            requireContext(),
            "Do you want to update Workspace ?",
        ) { nm, desc ->
            onUpdateWorkspace(id, nm, desc)
        }.show()
    }
}