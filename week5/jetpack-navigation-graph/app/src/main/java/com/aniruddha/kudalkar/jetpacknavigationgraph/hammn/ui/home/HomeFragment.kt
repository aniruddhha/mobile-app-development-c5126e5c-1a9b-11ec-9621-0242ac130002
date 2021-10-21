package com.aniruddha.kudalkar.jetpacknavigationgraph.hammn.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
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
        binding.recMls.adapter = HomeAdapter(
            requireContext(),
            listOf(
                HomeData("Abc", "11:00"),
                HomeData("Pqr", "11:15"),
                HomeData("Lmn", "12:15"),
                HomeData("Tuv", "12:30"),
                HomeData("Xyz", "07:09")
            )
        )
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