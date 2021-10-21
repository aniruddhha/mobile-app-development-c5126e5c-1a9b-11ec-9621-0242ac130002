package com.aniruddha.kudalkar.jetpacknavigationgraph.adv.ui.notifications

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.aniruddha.kudalkar.jetpacknavigationgraph.R
import com.aniruddha.kudalkar.jetpacknavigationgraph.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        requireActivity().onBackPressedDispatcher.addCallback(this) {
            Log.i("@ani", "Back Pressed Notification")
//            findNavController().navigateUp()
//            findNavController().navigate(R.id.navigation_dashboard)

            val builder = NavOptions.Builder()
                .setLaunchSingleTop(true)
            builder.setPopUpTo(
                R.id.navigation_notifications,
                true
            )
            val options = builder.build()
//            findNavController().popBackStack(R.id.navigation_notifications, true)
            findNavController().navigate(R.id.navigation_dashboard, null, options)
            Log.i("@ani", "Back Pressed Notification, ${requireActivity().supportFragmentManager.backStackEntryCount}")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNotifications
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}