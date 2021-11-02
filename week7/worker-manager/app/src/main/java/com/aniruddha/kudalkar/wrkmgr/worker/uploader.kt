package com.aniruddha.kudalkar.wrkmgr.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class FileUploadWorker(
    private val context : Context,
    private val params : WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        return Result.success()
    }
}