package com.aniruddha.kudalkar.expensemanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.aniruddha.kudalkar.expensemanager.databinding.FragmentExpenseListBinding


class ExpenseListFragment : Fragment() {

    private val viewModel: ExpenseViewModel by activityViewModels()

    private var _binding: FragmentExpenseListBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentExpenseListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(requireContext(), "Called", Toast.LENGTH_SHORT).show()

        val adapter = ExpenseListAdapter(
            requireContext(),
            viewModel.getExpenses()
        )

        binding.recExpLst.adapter = adapter

        val layoutManager = LinearLayoutManager(requireContext())
        binding.recExpLst.layoutManager = layoutManager
        binding.recExpLst.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                layoutManager.orientation
            )
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}