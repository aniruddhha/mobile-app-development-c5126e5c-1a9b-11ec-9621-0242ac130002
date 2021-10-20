package com.aniruddha.kudalkar.jetpacknavigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aniruddha.kudalkar.jetpacknavigationgraph.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_viewTxnFragment)
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_chooseRecipientFragment)
        }

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }
    }
}