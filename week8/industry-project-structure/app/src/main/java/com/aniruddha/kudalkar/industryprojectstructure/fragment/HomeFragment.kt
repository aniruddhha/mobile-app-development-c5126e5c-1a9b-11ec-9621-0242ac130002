package com.aniruddha.kudalkar.industryprojectstructure.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
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

    private val scp : CoroutineScope = CoroutineScope(Dispatchers.IO)

    @Inject
    lateinit var repository: RemoteOrganizationRepository

    private var _binding : FragmentHomeBinding? = null

    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
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
                        organizations
                    )
                    binding.recOrg.adapter = adapter
                }
            }
        }
    }
}