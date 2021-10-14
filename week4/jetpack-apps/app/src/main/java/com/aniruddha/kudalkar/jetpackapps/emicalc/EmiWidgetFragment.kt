package com.aniruddha.kudalkar.jetpackapps.emicalc

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
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
    ): View {

        val viewModel : EmiViewModel by activityViewModels()

        val binding = DataBindingUtil.inflate<FragmentEmiWidgetBinding>(
            inflater,
            R.layout.fragment_emi_widget,
            container,
            false
        )
        binding.lifecycleOwner = this
        binding.vm = viewModel
        binding.frag = getFragmentType()
        binding.etHnt = etHint()

        return binding.root
    }

    private fun getFragmentType() = when(id) {
        R.id.fragmentContainerView3 -> "P"
        R.id.fragmentContainerView4 -> "R"
        else -> "N"
    }

    private fun etHint() = when(id) {
        R.id.fragmentContainerView3 -> "Loan Amount"
        R.id.fragmentContainerView4 -> "Rate Of Interest"
        else -> "Duration"
    }
}