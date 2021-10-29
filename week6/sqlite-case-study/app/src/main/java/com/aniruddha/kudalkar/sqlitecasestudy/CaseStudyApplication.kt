package com.aniruddha.kudalkar.sqlitecasestudy

import android.app.Application
import android.util.Log
import androidx.room.Room
import com.aniruddha.kudalkar.sqlitecasestudy.db.AppDatabase

class CaseStudyApplication : Application() {

//    private lateinit var db : AppDatabase

    val db : AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "exp_mgr_db"
        ).build()
    }

    override fun onCreate() {
        super.onCreate()

        Log.i("@ani", "1 ${db.hashCode()}")
        Log.i("@ani", "2 ${db.hashCode()}")
        Log.i("@ani", "3 ${db.hashCode()}")

        /*db = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "exp_mgr_db"
        ).build()*/
    }

//    fun getAppDb() = db
}