package com.aniruddha.kudalkar.jetpacknavigationgraph.fundamentals

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.aniruddha.kudalkar.jetpacknavigationgraph.R
import com.aniruddha.kudalkar.jetpacknavigationgraph.databinding.FragmentSpecifyAmountBinding


class SpecifyAmountFragment : Fragment() {

    private lateinit var binding : FragmentSpecifyAmountBinding
    private val args : SpecifyAmountFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSpecifyAmountBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navCon = findNavController()

        binding.textView3.text = "Sending Money to ${args.nm}"
        binding.textView3.text = arguments?.getString("nm") ?: ""

        binding.button6.setOnClickListener {

            val nm = args.nm
            val amt = binding.editTextTextPersonName2.text.toString().toInt()

            val action = SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToConfirmationFragment(nm, amt)
            navCon.navigate(action)
        }

        binding.button7.setOnClickListener {
            navCon.popBackStack(R.id.mainFragment, false)
        }
    }
}