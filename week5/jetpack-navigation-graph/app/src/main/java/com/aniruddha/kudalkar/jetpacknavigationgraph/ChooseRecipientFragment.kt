package com.aniruddha.kudalkar.jetpacknavigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.aniruddha.kudalkar.jetpacknavigationgraph.databinding.FragmentChooseRecipientBinding

class ChooseRecipientFragment : Fragment() {

    private lateinit var binding: FragmentChooseRecipientBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentChooseRecipientBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navCon = findNavController()

        binding.button4.setOnClickListener {
            passUsingBundle(navCon)
        }
        binding.button5.setOnClickListener { navCon.popBackStack() }
    }

    private fun passUsingArguments(navCon : NavController) {
        val nm = binding.editTextTextPersonName.text.toString()
        val action = ChooseRecipientFragmentDirections.actionChooseRecipientFragmentToSpecifyAmountFragment(nm)
        navCon.navigate(action)
    }

    private fun passUsingBundle(navCon : NavController) {
        val nm = binding.editTextTextPersonName.text.toString()
        val bndl = bundleOf()
        bndl.putString("nm", nm)
        navCon.navigate(R.id.action_chooseRecipientFragment_to_specifyAmountFragment, bndl)
    }
}