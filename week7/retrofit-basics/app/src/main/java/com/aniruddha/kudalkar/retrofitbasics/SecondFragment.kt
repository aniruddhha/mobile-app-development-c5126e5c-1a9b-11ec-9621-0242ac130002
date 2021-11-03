package com.aniruddha.kudalkar.retrofitbasics

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.aniruddha.kudalkar.retrofitbasics.databinding.FragmentSecondBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private val reqResApi: ReqResApi by lazy {
        (requireActivity().application as ReqResApp).reqResApi
    }

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

        binding.btCrt.setOnClickListener {
            val regUser = RegUser(
                binding.etEm.text.toString(),
                binding.etPass.text.toString()
            )

            reqResApi.save(regUser).enqueue(object : Callback<RegResponse> {
                override fun onResponse(call: Call<RegResponse>, response: Response<RegResponse>) {

                    Log.i("@ani", "Status ${response.code()}")
                    Log.i("@ani", "Body ${response.body().toString()}")

                    if(response.code() == 200) {
                        Toast.makeText(
                            requireContext(),
                            "${response.body()?.token}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                override fun onFailure(call: Call<RegResponse>, t: Throwable) {
                    Toast.makeText(requireContext(), "Problem In creating user", Toast.LENGTH_SHORT)
                        .show()
                }
            })
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}