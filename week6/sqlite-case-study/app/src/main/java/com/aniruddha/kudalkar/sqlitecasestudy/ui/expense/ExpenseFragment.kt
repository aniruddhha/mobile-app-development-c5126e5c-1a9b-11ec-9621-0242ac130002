package com.aniruddha.kudalkar.sqlitecasestudy.ui.expense

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.aniruddha.kudalkar.sqlitecasestudy.CaseStudyApplication
import com.aniruddha.kudalkar.sqlitecasestudy.databinding.FragmentExpenseBinding

class ExpenseFragment : Fragment() {

    private val vm : ExpenseViewModel by viewModels()

    private  var _binding : FragmentExpenseBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentExpenseBinding.inflate(
            inflater,
            container,
            false
        )
        binding.lifecycleOwner = this
        binding.vm = vm

        vm.setExpenseDao(
            (requireActivity().application as CaseStudyApplication).db.expenseDao()
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}