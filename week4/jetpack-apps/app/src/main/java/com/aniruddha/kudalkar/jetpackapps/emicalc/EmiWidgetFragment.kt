package com.aniruddha.kudalkar.jetpackapps.emicalc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.FragmentEmiWidgetBinding


class EmiWidgetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentEmiWidgetBinding>(
            inflater,
            R.layout.fragment_emi_widget,
            container,
            false
        )
        binding.lifecycleOwner = this

        val viewModel : EmiViewModel by activityViewModels()
        binding.vm = viewModel

        return binding.root
    }
}