package com.aniruddha.kudalkar.jetpackapps.archcomp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.FragmentDbDemoBinding
import java.util.*

class DbDemoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding =  DataBindingUtil.inflate<FragmentDbDemoBinding>(
            inflater,
            R.layout.fragment_db_demo,
            container,
            false
        )

        binding.dt = Date()

        return binding.root
    }
}