package com.aniruddha.kudalkar.retrofitbasics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.aniruddha.kudalkar.retrofitbasics.databinding.FragmentFirstBinding
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private val reqResApi: ReqResApi by lazy {
        (requireActivity().application as ReqResApp).reqResApi
    }

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

        val lm = LinearLayoutManager(requireContext())
        binding.rec.layoutManager = lm

        binding.rec.layoutManager = lm
        binding.rec.addItemDecoration(DividerItemDecoration(requireContext(), lm.orientation))

        reqResApi.users().enqueue(object : Callback<ReqResMain> {
            override fun onResponse(
                call: Call<ReqResMain>,
                response: Response<ReqResMain>
            ) {
                val users = response.body()
                users?.let {
                    val adapter = ReqResAdapter(
                        requireContext(), it.data
                    )
                    binding.rec.adapter = adapter
                }
            }

            override fun onFailure(call: Call<ReqResMain>, t: Throwable) {
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}