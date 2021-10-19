package com.aniruddha.kudalkar.myapplication.recgrd

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.myapplication.R
import com.aniruddha.kudalkar.myapplication.databinding.FragmentRecBasicDetailsBinding
import com.aniruddha.kudalkar.myapplication.databinding.FragmentRecGrdBinding

class RecGrdFragment : Fragment() {

    private lateinit var binding: FragmentRecGrdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        activity?.title="Dashboard"

        val viewModel : SharedViewModel by activityViewModels()

        binding = DataBindingUtil.inflate<FragmentRecGrdBinding>(
            inflater,
            R.layout.fragment_rec_grd,
            container,
            false
        )
        binding.lifecycleOwner = this
        binding.vm = viewModel

        Log.i("@ani", "In Dash Fragment")
        Log.i("@ani", viewModel.appData.value.toString())

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recDsh.layoutManager = GridLayoutManager(
            requireContext(),
            2
        )
        val adapter = RecDshAdapter(
            requireContext(),
            listOf(
                RecDsh("Basic Details", R.drawable.ic_ad),
                RecDsh("Salary Details", R.drawable.ic_st),
                RecDsh("Salary Card", R.drawable.ic_pff)
            )
        )
        adapter.itemClick.observe(viewLifecycleOwner) {
            when (it.menu) {
                "Basic Details" -> activity?.supportFragmentManager?.commit {
                    replace<RecBasicDetailsFragment>(R.id.fragmentContainerView)
                    addToBackStack("RecHomeFragment")
                }
                "Salary Details" ->  activity?.supportFragmentManager?.commit {
                    replace<RecSalaryDetailsFragment>(R.id.fragmentContainerView)
                    addToBackStack("RecHomeFragment")
                }
                "Salary Card" -> activity?.supportFragmentManager?.commit {
                    replace<RecSalaryCardFragment>(R.id.fragmentContainerView)
                    addToBackStack("RecSettingsFragment")
                }
                else -> activity?.supportFragmentManager?.commit {
                    addToBackStack("RecProfileFragment")
                }
            }
        }
        binding.recDsh.adapter = adapter
    }
}