package com.aniruddha.kudalkar.myapplication.recgrd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.aniruddha.kudalkar.myapplication.R

class TraditionalFragment : Fragment() {

    // Arguments - Fragment says, i will not accept the constructor with parameter
    // instead you should send arguments

//    companion object {
//
//        fun newInstance() : Fragment {
//            val fragment = TraditionalFragment()
//
//            val bndl = Bundle()
//            fragment.setArguments(bndl)
//            return fragment
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bundle = getArguments()
        val col = bundle?.getString("onadajfdfskjdsjdah") ?: ""
        val colCode = bundle?.getString("zmxnvxcmjtdsusfy") ?: ""

        val root = inflater.inflate(R.layout.fragment_traditional, container, false)

        root.findViewById<TextView>(R.id.txtCol).setText(col)
        root.findViewById<TextView>(R.id.txtPcr).setText(colCode)

        return root
    }

}