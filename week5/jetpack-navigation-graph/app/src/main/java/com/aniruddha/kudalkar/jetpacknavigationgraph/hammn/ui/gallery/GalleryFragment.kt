package com.aniruddha.kudalkar.jetpacknavigationgraph.hammn.ui.gallery

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.aniruddha.kudalkar.jetpacknavigationgraph.R
import com.aniruddha.kudalkar.jetpacknavigationgraph.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private val galleryViewModel: GalleryViewModel by viewModels()

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        _binding?.vm = galleryViewModel
        galleryViewModel.setData("Hello", ContextCompat.getDrawable(requireContext(), R.drawable.ic_blb_off)!!)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}