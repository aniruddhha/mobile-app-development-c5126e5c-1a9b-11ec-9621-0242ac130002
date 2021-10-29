package com.aniruddha.kudalkar.sqliteroombasics.ui

import android.os.Bundle
import android.provider.DocumentsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.aniruddha.kudalkar.sqliteroombasics.R
import com.aniruddha.kudalkar.sqliteroombasics.databinding.FragmentSecondBinding
import com.aniruddha.kudalkar.sqliteroombasics.db.Dealer
import com.aniruddha.kudalkar.sqliteroombasics.db.DealerDao
import com.aniruddha.kudalkar.sqliteroombasics.db.DealerDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private lateinit var scp : CoroutineScope
    private lateinit var db : DealerDatabase
    private lateinit var dealerDao : DealerDao

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


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
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lm = LinearLayoutManager(requireContext())
        binding.recDls.layoutManager = lm
        binding.recDls.addItemDecoration(
            DividerItemDecoration(requireContext(), lm.orientation )
        )

        loadFromDatabase()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun loadSampleData() {

        val dealers = listOf(
            Dealer(
                dlNm = "abc",
                mobile = "1245647",
                isActive = true,
                period = 12
            ),
            Dealer(
                dlNm = "pqr",
                mobile = "979576",
                isActive = false,
                period = 10
            ),
            Dealer(
                dlNm = "lmn",
                mobile = "09978",
                isActive = false,
                period = 10
            )
        )

        binding.recDls.adapter = DealerAdapter(
            requireContext(),
            dealers
        )
    }

    private fun loadFromDatabase() {

        scp.launch {
            val dealers = dealerDao.findAllDealers()

            withContext(Dispatchers.Main) {
                binding.recDls.adapter = DealerAdapter(
                    requireContext(),
                    dealers
                )
            }
        }
    }
}