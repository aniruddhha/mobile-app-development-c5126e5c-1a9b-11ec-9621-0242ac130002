package com.aniruddha.kudalkar.filehandlingintro

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aniruddha.kudalkar.filehandlingintro.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btRd.setOnClickListener {
            storageLocationInfo()
        }

        binding.btWr.setOnClickListener {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun storageLocationInfo() {
        Log.i("@ani", "Internal Storage Location - ${requireContext().filesDir.absolutePath}")
        Log.i("@ani", "External Storage Location - ${requireContext().getExternalFilesDir("")?.absolutePath}")
    }

    private fun writeInternalStorage() {

    }

    private fun readInternalStorage() {

    }
}