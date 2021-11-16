package com.aniruddha.kudalkar.industryprojectstructure.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.util.Log
import android.view.LayoutInflater
import android.widget.EditText
import com.aniruddha.kudalkar.industryprojectstructure.R
import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import com.aniruddha.kudalkar.industryprojectstructure.dto.OrganizationDto

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

    fun createInputYesNoDialog(
        context: Context,
        msg :  String,
        listener : (orgNm : String, orgDesc : String) -> Unit
    ) : Dialog {

        val vw = LayoutInflater.from(context).inflate(R.layout.yes_no_input_dialog_layout, null)



        val dialog = AlertDialog.Builder(context)
            .setMessage(msg)
            .setPositiveButton("Yes") { di, wh ->
                val updNm = vw.findViewById<EditText>(R.id.etOrgNm).text.toString()
                val updDesc = vw.findViewById<EditText>(R.id.etOrdDesc).text.toString()
                Log.i("@ani", "In Dialog - $updNm, $updDesc")
                listener(updNm, updDesc)
            }
            .setNegativeButton("No") { di, wh -> di.dismiss()}
            .setView(vw)
            .create()

        dialog.setCanceledOnTouchOutside(false)
        return dialog
    }
}