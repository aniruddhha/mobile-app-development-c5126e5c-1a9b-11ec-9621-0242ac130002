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

    companion object {
        const val KEY_COLOR = "color"
        const val KEY_COLOR_CODE = "colorCode"

        fun newInstance( col : String, cod : String ) : Fragment {
            val fragment = TraditionalFragment()
            val bundle = Bundle()
            bundle.putString(KEY_COLOR, col)
            bundle.putString(KEY_COLOR_CODE, cod)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bundle = arguments
        val col = bundle?.getString(KEY_COLOR) ?: ""
        val colCode = bundle?.getString(KEY_COLOR_CODE) ?: ""

        val root = inflater.inflate(R.layout.fragment_traditional, container, false)

        root.findViewById<TextView>(R.id.txtCol).text = col
        root.findViewById<TextView>(R.id.txtPcr).text = colCode

        return root
    }
}