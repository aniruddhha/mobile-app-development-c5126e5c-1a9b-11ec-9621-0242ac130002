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
        return Result.retry()
    }
}

