package com.aniruddha.kudalkar.expensemanager

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExpenseDetailsFragment : Fragment(R.layout.fragment_expense_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btNty).setOnClickListener {

            createNotificationChannel()

            val builder = NotificationCompat.Builder(
                requireActivity(),
                "123"
            )
                .setSmallIcon(R.drawable.ic_err)
                .setContentTitle("Title")
                .setContentText("Content Text")
                .setStyle(
                    NotificationCompat.BigTextStyle()
                        .bigText("Big Text")
                )
                .setPriority(NotificationCompat.PRIORITY_LOW)

            NotificationManagerCompat
                .from(requireActivity())
                .notify(3231, builder.build())
        }
    }

    private fun createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "my_data"
            val descriptionText = "this is description text"
            val importance = NotificationManager.IMPORTANCE_LOW
            val channel = NotificationChannel("123", name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                requireActivity().getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    @RequiresApi(value = Build.VERSION_CODES.LOLLIPOP)
    private fun abc() {
        // this function is meant only for lollipop
    }
}