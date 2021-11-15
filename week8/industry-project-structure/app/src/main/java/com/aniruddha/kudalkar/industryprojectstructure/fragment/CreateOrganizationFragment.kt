package com.aniruddha.kudalkar.industryprojectstructure.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.aniruddha.kudalkar.industryprojectstructure.R
import com.aniruddha.kudalkar.industryprojectstructure.databinding.CreateOrganizationFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateOrganizationFragment : Fragment() {


    private var _binding : CreateOrganizationFragmentBinding? = null

    val binding get() = _binding!!

    private val viewModel: CreateOrganizationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = CreateOrganizationFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}