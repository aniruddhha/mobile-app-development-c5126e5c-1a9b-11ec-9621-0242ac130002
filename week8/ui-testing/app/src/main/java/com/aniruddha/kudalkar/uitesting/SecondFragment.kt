package com.aniruddha.kudalkar.uitesting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.aniruddha.kudalkar.uitesting.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            binding.rec.visibility = if(isChecked) View.VISIBLE else View.GONE
        }

        val lm = LinearLayoutManager(requireContext())
        binding.rec.layoutManager = lm
        binding.rec.adapter = RecAdapter(
            requireContext(),
            listOf(
                RecItm(1, "abc"),
                RecItm(2, "pqr"),
                RecItm(3, "lmn"),
                RecItm(4, "xyz"),
                RecItm(5, "hjg"),
                RecItm(6, "nml"),
                RecItm(7, "opy"),
                RecItm(8, "swq"),
                RecItm(9, "bxw"),
                RecItm(10, "opq"),
                RecItm(11, "bqa"),
                RecItm(12, "lqw"),
                RecItm(13, "poq"),
                RecItm(14, "rqw"),
                RecItm(15, "mcx"),
                RecItm(16, "tpk"),
                RecItm(17, "lop"),
                RecItm(18, "uio"),
                RecItm(19, "maq"),
                RecItm(20, "vas"),
                RecItm(21, "lty"),
            )
        )
        binding.rec.addItemDecoration(
            DividerItemDecoration(requireContext(), lm.orientation)
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}