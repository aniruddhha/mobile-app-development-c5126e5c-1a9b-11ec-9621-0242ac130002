package com.aniruddha.kudalkar.sqlitecasestudy.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.aniruddha.kudalkar.sqlitecasestudy.CaseStudyApplication
import com.aniruddha.kudalkar.sqlitecasestudy.R

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun accessAppInFragment() {
        val app = requireActivity().application as CaseStudyApplication
        app.db.expenseDao()
    }
}