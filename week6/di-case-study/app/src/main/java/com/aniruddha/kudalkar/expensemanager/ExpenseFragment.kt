package com.aniruddha.kudalkar.expensemanager

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.content.ContextCompat
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.aniruddha.kudalkar.expensemanager.databinding.FragmentExpenseBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ExpenseFragment : Fragment() {

    private val viewModel: ExpenseViewModel by activityViewModels()

    private var _binding: FragmentExpenseBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentExpenseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataSource = listOf("Tea", "Coffee", "Vada Pav")
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_expandable_list_item_1,
            dataSource
        )

        binding.expIc.adapter = adapter

        binding.btSv.setOnClickListener {

            /*if(binding.expNm.toString().isEmpty()) {

                val drawable = ContextCompat.getDrawable(requireContext(), R.drawable.ic_err)
                drawable?.setBounds(0, 0 , drawable.intrinsicWidth, drawable.intrinsicHeight )

                binding.expNm.setError(
                    "Mandatory Field",
                    drawable
                )

            }*/

            viewModel.createExpense(
                Expense(
                    12,
                    binding.expNm.text.toString(),
                    binding.expAmt.text.toString().toDouble(),
                    R.drawable.ic_plc
                )
            )
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}