package com.aniruddha.kudalkar.sqlitecasestudy

import android.app.Application
import androidx.room.Room
import com.aniruddha.kudalkar.sqlitecasestudy.db.AppDatabase

class CaseStudyApplication : Application() {

    private lateinit var db : AppDatabase

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "exp_mgr_db"
        ).build()
    }

    fun getAppDb() = db
}