package com.aniruddha.kudalkar.wrkmgr.worker

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import kotlinx.coroutines.delay
import java.util.stream.IntStream.range

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

class SampleProgressWork(
    private val context : Context,
    private val params : WorkerParameters
) : CoroutineWorker(context, params) {

    companion object {
        const val KEY_FILE_PROGRESS = "key_progress"
    }

    override suspend fun doWork(): Result {
        for (i in 0..100) {
            val prg = workDataOf( KEY_FILE_PROGRESS to i)
            delay(1500)
            setProgress(prg)
        }
        return Result.success()
    }
}

