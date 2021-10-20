package com.aniruddha.kudalkar.jetpacknavigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.aniruddha.kudalkar.jetpacknavigationgraph.databinding.FragmentConfirmationBinding

class ConfirmationFragment : Fragment() {

    private val args : ConfirmationFragmentArgs by navArgs()

    private lateinit var binding : FragmentConfirmationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentConfirmationBinding.inflate(
            inflater,
            container,
            false
        )

        binding.textView4.text = "Yo have sent INR.${args.amt} to ${args.nm} "

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navCon = findNavController()

        binding.textView5.setOnClickListener {
            navCon.popBackStack(R.id.mainFragment, false)
        }
    }
}