package com.aniruddha.kudalkar.filehandlingintro

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aniruddha.kudalkar.filehandlingintro.databinding.FragmentFirstBinding
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.lang.StringBuilder

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
            val dt = readExternalStorage()
            binding.textView.text = dt
        }

        binding.btWr.setOnClickListener {
            val str = binding.editTextTextPersonName.text.toString()
            writeExternalStorage(str)
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

    private fun writeInternalStorage(str : String) {
        val fos = requireContext().openFileOutput("my.txt",Context.MODE_PRIVATE)
        fos.write(str.toByteArray())
        fos.close()
    }

    private fun readInternalStorage() : String {
        val fis = requireContext().openFileInput("my.txt")
        val sb = StringBuilder()
        while(true) {
            val ch = fis.read()
            if(ch == -1) break
            else sb.append(ch.toChar())
        }
        Log.i("@ani", "File Data As Below")
        Log.i("@ani", sb.toString())

        return sb.toString()
    }

    private fun writeExternalStorage(str : String) {
        val file = File(requireContext().getExternalFilesDir(""), "ext-my.txt")
        val fos = FileOutputStream(file)
        fos.write(str.toByteArray())
        fos.close()
    }

    private fun readExternalStorage(): String {
        val file = File(requireContext().getExternalFilesDir(""), "ext-my.txt")
        val fis = FileInputStream(file)
        val sb = StringBuilder()
        while(true) {
            val ch = fis.read()
            if(ch == -1) break
            else sb.append(ch.toChar())
        }
        Log.i("@ani", "File Data As Below")
        Log.i("@ani", sb.toString())

        return sb.toString()
    }
}