package com.aniruddha.kudalkar.jetpackapps.fragcom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.FragmentContentBinding

//FragmentContentBinding
class ContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = DataBindingUtil.inflate<FragmentContentBinding>(
            inflater,
            R.layout.fragment_content,
            container,
            false
        )
        binding.aggg = "#ff0000"

        val viewModel: FragCommViewModel by activityViewModels()

        viewModel.color.observe(this) {
            binding.aggg = it
        }

        return binding.root
    }
}