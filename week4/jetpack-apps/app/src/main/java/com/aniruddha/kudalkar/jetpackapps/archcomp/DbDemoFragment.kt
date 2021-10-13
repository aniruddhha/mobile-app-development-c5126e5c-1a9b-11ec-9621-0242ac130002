package com.aniruddha.kudalkar.jetpackapps.archcomp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.databinding.DataBindingUtil
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.FragmentDbDemoBinding
import java.util.*

class DbDemoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding =  DataBindingUtil.inflate<FragmentDbDemoBinding>(
            inflater,
            R.layout.fragment_db_demo,
            container,
            false
        )

        binding.dt = Date()
        binding.setDt(Date())

        binding.swNm = "Android"
        binding.setSwNm("Android")

        binding.swSt = false

        binding.chkLsnr = CompoundButton.OnCheckedChangeListener { btn, sts -> Log.i("@ani", "State $sts")   }
        binding.setChkLsnr { buttonView, isChecked -> Log.i("@ani", "State $isChecked")  }

        return binding.root
    }
}