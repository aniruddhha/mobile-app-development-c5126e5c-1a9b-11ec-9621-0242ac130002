package com.aniruddha.kudalkar.jetpacknavigationgraph.hammn.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.aniruddha.kudalkar.jetpacknavigationgraph.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by viewModels()

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val linearLayoutManager = LinearLayoutManager(requireContext())
        binding.recMls.layoutManager = linearLayoutManager

        val dataSource = listOf(
            HomeData("Abc", "11:00", false),
            HomeData("Pqr", "11:15", false),
            HomeData("Lmn", "12:15", false),
            HomeData("Tuv", "12:30", false),
            HomeData("Xyz", "07:09", false)
        )
        val adapter = HomeAdapter(
            requireContext(),
            dataSource
        )
        adapter.clkPos.observe(viewLifecycleOwner) {
            val item = dataSource[it]
            val action = HomeFragmentDirections.actionNavHomeToNavGallery(
                item.from,
                item.blb
            )
            findNavController().navigate(action)
        }

        binding.recMls.adapter = adapter
        binding.recMls.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                linearLayoutManager.orientation
            )
        )

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}