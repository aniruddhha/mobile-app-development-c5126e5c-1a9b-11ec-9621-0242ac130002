package com.aniruddha.kudalkar.jetpackapps.archcomp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.FragmentVmDemoBinding


class VmDemoFragment : Fragment() {

    private lateinit var binding : FragmentVmDemoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentVmDemoBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }
}