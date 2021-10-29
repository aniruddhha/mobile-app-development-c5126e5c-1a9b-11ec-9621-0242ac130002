package com.aniruddha.kudalkar.sqlitecasestudy.ui.expense

import android.os.Bundle
import android.os.RecoverySystem
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.sqlitecasestudy.CaseStudyApplication
import com.aniruddha.kudalkar.sqlitecasestudy.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ExpenseListFragment : Fragment(R.layout.fragment_expense_list) {

    val scp = CoroutineScope(Dispatchers.IO)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val app = requireActivity().application as CaseStudyApplication

        val rec = view.findViewById<RecyclerView>(R.id.recExp)

        val lm = LinearLayoutManager(requireContext())

        rec.layoutManager = lm
        rec.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                lm.orientation
            )
        )

        scp.launch {

            val expenses =  app.db.expenseDao().findAllExpenses()

            withContext(Dispatchers.Main) {
                rec.adapter = ExpenseListAdapter(
                    requireContext(),
                    expenses
                )
            }
        }
    }
}