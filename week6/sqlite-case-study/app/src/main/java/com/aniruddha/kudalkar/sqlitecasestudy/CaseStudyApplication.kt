package com.aniruddha.kudalkar.sqlitecasestudy

import android.app.Application
import androidx.room.Room
import com.aniruddha.kudalkar.sqlitecasestudy.db.AppDatabase

class CaseStudyApplication : Application() {
    val db : AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "exp_mgr_db"
        ).build()
    }
}