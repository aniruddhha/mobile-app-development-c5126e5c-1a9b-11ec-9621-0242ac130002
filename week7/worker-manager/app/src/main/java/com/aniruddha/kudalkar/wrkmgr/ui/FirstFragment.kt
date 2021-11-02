package com.aniruddha.kudalkar.wrkmgr.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.aniruddha.kudalkar.wrkmgr.R
import com.aniruddha.kudalkar.wrkmgr.databinding.FragmentFirstBinding
import com.aniruddha.kudalkar.wrkmgr.worker.FileUploadWork
import com.aniruddha.kudalkar.wrkmgr.worker.SampleProgressWork

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
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            scheduleOnce(requireContext())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun scheduleOnce(context: Context) {
        val uploadRequest = OneTimeWorkRequestBuilder<SampleProgressWork>().build()
        val wm = WorkManager.getInstance(context)
        wm.enqueue(uploadRequest)

        wm.getWorkInfoByIdLiveData(uploadRequest.id)
            .observe(viewLifecycleOwner) {
                val prg = it.progress.getInt(SampleProgressWork.KEY_FILE_PROGRESS, -1)
                binding.progressBar.progress = prg
            }
    }
}