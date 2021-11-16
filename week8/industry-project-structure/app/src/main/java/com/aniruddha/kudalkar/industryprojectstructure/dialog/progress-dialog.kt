package com.aniruddha.kudalkar.industryprojectstructure.dialog

import android.app.AlertDialog
import android.content.Context
import com.aniruddha.kudalkar.industryprojectstructure.R

object DialogMaker {
    fun createProgressDialog(context : Context, msg  : String) :AlertDialog {
        val dialog = AlertDialog.Builder(context)
            .setMessage(msg)
            .setView(R.layout.progress_dialog_layout)
            .create()

        dialog.setCanceledOnTouchOutside(false)
        return dialog
    }
}
