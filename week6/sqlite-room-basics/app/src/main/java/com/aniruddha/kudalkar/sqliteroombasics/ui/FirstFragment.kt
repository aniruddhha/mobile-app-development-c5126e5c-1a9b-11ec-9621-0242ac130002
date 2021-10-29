package com.aniruddha.kudalkar.sqliteroombasics.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.aniruddha.kudalkar.sqliteroombasics.R
import com.aniruddha.kudalkar.sqliteroombasics.databinding.FragmentFirstBinding
import com.aniruddha.kudalkar.sqliteroombasics.db.Dealer
import com.aniruddha.kudalkar.sqliteroombasics.db.DealerDao
import com.aniruddha.kudalkar.sqliteroombasics.db.DealerDatabase
import kotlinx.coroutines.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    private lateinit var db: DealerDatabase
    private lateinit var dealerDao: DealerDao
    private lateinit var scp : CoroutineScope

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        scp = CoroutineScope(Dispatchers.IO)

        db = Room.databaseBuilder(
            requireContext(),
            DealerDatabase::class.java,
            "dealer-database"
        ).build()

        dealerDao = db.dealerDao()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btSv.setOnClickListener {
            val dlr = Dealer(
                dlNm = binding.etDlNm.text.toString(),
                mobile = binding.etDlMb.text.toString(),
                period = binding.etDlPrd.text.toString().toInt(),
                isActive = binding.swAct.isChecked
            )

            scp.launch {
                dealerDao.createNewDealer(dlr)
                withContext(Dispatchers.Main) {
                    binding.txtSt.text = "Dealer Saved Successfully"
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onDestroy() {
        scp.cancel()
        super.onDestroy()
    }
}