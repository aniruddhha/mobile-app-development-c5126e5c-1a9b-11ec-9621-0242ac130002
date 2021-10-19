package com.aniruddha.kudalkar.myapplication.recgrd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.aniruddha.kudalkar.myapplication.MainActivity
import com.aniruddha.kudalkar.myapplication.R
import com.aniruddha.kudalkar.myapplication.databinding.FragmentRecBasicDetailsBinding

class RecBasicDetailsFragment : Fragment() {

    private val vm: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        activity?.title = "Basic Details"

        val binding = DataBindingUtil.inflate<FragmentRecBasicDetailsBinding>(
            inflater,
            R.layout.fragment_rec_basic_details,
            container,
            false
        )
        binding.lifecycleOwner = this
        binding.vm = vm

        return binding.root
    }
}