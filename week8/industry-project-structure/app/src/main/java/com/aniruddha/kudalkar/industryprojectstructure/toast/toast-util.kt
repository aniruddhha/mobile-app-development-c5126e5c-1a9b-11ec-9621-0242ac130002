package com.aniruddha.kudalkar.industryprojectstructure.toast

import android.content.Context
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object ToastUtil {

    fun normalToast(context : Context, msg : String) {
        Toast.makeText(
            context,
            msg,
            Toast.LENGTH_SHORT
        ).show()
    }

    suspend fun coroutineToast( context: Context, msg : String ) {
        withContext(Dispatchers.Main) {
            Toast.makeText(
                context,
                msg,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}