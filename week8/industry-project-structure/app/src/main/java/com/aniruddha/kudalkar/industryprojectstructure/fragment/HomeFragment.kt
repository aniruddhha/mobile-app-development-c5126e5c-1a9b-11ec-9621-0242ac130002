package com.aniruddha.kudalkar.industryprojectstructure.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.aniruddha.kudalkar.industryprojectstructure.MainActivity
import com.aniruddha.kudalkar.industryprojectstructure.adapter.HomeAdapter
import com.aniruddha.kudalkar.industryprojectstructure.databinding.FragmentHomeBinding
import com.aniruddha.kudalkar.industryprojectstructure.repository.RemoteOrganizationRepository
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
            when(it.operation) {
                "edit" -> {
                    Log.i("@ani", "Edit Clicked")
                }
                "delete" -> {
                    Log.i("@ani", "Delete Clicked")
                }
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
}