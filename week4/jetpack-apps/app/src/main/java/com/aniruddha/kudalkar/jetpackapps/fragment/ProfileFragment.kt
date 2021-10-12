package com.aniruddha.kudalkar.jetpackapps.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.aniruddha.kudalkar.jetpackapps.R
import java.util.*

class ProfileFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_profile,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val et = view.findViewById<EditText>(R.id.etNm)

        val btn = view.findViewById<Button>(R.id.btOk)
        btn.setOnClickListener {
            et.setText(Date().toString())
        }
    }
}