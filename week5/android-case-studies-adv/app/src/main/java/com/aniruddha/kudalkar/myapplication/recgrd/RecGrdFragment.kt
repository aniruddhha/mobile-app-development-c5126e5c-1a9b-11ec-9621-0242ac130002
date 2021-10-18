package com.aniruddha.kudalkar.myapplication.recgrd

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.myapplication.R

class RecGrdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rec_grd, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recDsh = view.findViewById<RecyclerView>(R.id.recDsh)
        recDsh.layoutManager = GridLayoutManager(
            requireContext(),
            2
        )
        val adapter = RecDshAdapter(
            requireContext(),
            listOf(
                RecDsh("Home", R.drawable.ic_ph),
                RecDsh("Admin", R.drawable.ic_ad),
                RecDsh("Settings", R.drawable.ic_st),
                RecDsh("Profile", R.drawable.ic_pff)
            )
        )
        /**adapter.itemClick.subscribe {
            when (it.menu) {
                "Home" -> Log.i("@ani", "Home Clicked")
                "Admin" -> Log.i("@ani", "Admin Clicked")
                "Settings" -> Log.i("@ani", "Settings Clicked")
                else -> Log.i("@ani", "Profile Clicked")
            }
        }*/

        adapter.itemClick.observe(viewLifecycleOwner) {
            when (it.menu) {
                "Home" -> Log.i("@ani", "Home Clicked")
                "Admin" -> Log.i("@ani", "Admin Clicked")
                "Settings" -> Log.i("@ani", "Settings Clicked")
                else -> Log.i("@ani", "Profile Clicked")
            }
        }
        recDsh.adapter = adapter
    }
}