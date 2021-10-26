package com.aniruddha.kudalkar.expensemanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.aniruddha.kudalkar.expensemanager.databinding.FragmentExpenseListBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ExpenseListFragment : Fragment() {

    private var _binding: FragmentExpenseListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
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

        val dataSource = listOf(
            Expense(1, "Tea", 10.0, R.drawable.ic_plc),
            Expense(2, "Coffee", 15.0, R.drawable.ic_plc),
            Expense(3, "Vada Pav", 15.0, R.drawable.ic_plc),
            Expense(4, "Cold Coffee", 25.0, R.drawable.ic_plc)
        )

        val adapter = ExpenseListAdapter(
            requireContext(),
            dataSource
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