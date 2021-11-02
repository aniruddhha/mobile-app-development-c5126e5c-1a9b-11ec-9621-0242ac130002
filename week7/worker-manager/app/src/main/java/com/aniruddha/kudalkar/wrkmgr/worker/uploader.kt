package com.aniruddha.kudalkar.wrkmgr.worker

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class FileUploadWork(
    private val context : Context,
    private val params : WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {
        Log.i("@ani", "Doing File Upload")
        val nm = inputData.getString("KEY_FILE_NAME")
        val sz = inputData.getLong("KEY_FILE_SIZE", -1L)
        Log.i("@ani", "Name: $nm, Size: $sz")
        return Result.retry()
    }
}

