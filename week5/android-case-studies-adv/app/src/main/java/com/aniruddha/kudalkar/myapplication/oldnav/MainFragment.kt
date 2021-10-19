package com.aniruddha.kudalkar.myapplication.oldnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.aniruddha.kudalkar.myapplication.R

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        requireActivity().title = "Main"
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val act = (requireActivity() as OldNavActivity)
        view.findViewById<Button>(R.id.btnVwTxn).setOnClickListener {
            act.loadFragment(ViewTxnFragment.newInstance())
        }
        view.findViewById<Button>(R.id.btnSndMny).setOnClickListener {
            act.loadFragment(ChooseRecipientFragment.newInstance())
        }
        view.findViewById<Button>(R.id.btnVwBal).setOnClickListener {
            act.loadFragment(ViewBalanceFragment.newInstance("", ""))
        }
    }
}