package com.aniruddha.kudalkar.sqlitecasestudy.ui.dashboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.sqlitecasestudy.CaseStudyApplication
import com.aniruddha.kudalkar.sqlitecasestudy.R
import com.aniruddha.kudalkar.sqlitecasestudy.ui.DashAdapter
import com.aniruddha.kudalkar.sqlitecasestudy.ui.DashItem

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    private val vm : DashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rec = view.findViewById<RecyclerView>(R.id.recDash)

        rec.layoutManager = GridLayoutManager(
            requireContext(),
            2
        )

        val adapter = DashAdapter(
            requireContext(),
            listOf(
                DashItem(1, R.drawable.ic_and, "Expense"),
                DashItem(2, R.drawable.ic_and, "Analysis")
            ),
            vm
        )

        vm.itemClick.observe(viewLifecycleOwner) {
            when(it.id) {
                1 -> findNavController().navigate(R.id.action_dashboardFragment_to_expenseFragment)
            }
        }

        rec.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun accessAppInFragment() {
        val app = requireActivity().application as CaseStudyApplication
        app.db.expenseDao()
    }
}