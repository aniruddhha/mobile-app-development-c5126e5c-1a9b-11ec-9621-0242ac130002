package com.aniruddha.kudalkar.industryprojectstructure.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import com.aniruddha.kudalkar.industryprojectstructure.R

object YesNoDialogMaker {

    fun createSimpleYesNoDialog(context: Context, msg: String, listener : (di : DialogInterface, wh :Int) -> Unit ): Dialog {
        val dialog = AlertDialog.Builder(context)
            .setMessage(msg)
            .setPositiveButton("Yes", listener)
            .setNegativeButton("No", listener)
            .create()

        dialog.setCanceledOnTouchOutside(false)
        return dialog
    }
}