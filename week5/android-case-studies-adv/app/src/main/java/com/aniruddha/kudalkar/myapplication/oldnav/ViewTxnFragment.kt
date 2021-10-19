package com.aniruddha.kudalkar.myapplication.oldnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.aniruddha.kudalkar.myapplication.R
import com.aniruddha.kudalkar.myapplication.databinding.FragmentViewTxnBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ViewTxnFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        requireActivity().title = "View Transaction"

        val binding: FragmentViewTxnBinding = FragmentViewTxnBinding.inflate(
            inflater,
            container,
            false
        )

        binding.txtDt.text = "Data : INR. 1500"
        binding.txtFd.text = "Food : INR. 3000"

        return binding.root
    }

    companion object {
        fun newInstance() = ViewTxnFragment()
    }
}