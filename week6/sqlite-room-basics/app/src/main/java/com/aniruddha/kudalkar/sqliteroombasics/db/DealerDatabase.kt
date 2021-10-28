package com.aniruddha.kudalkar.sqliteroombasics.db

import androidx.room.Database
import androidx.room.RoomDatabase

// class helps you in connecting with db
@Database(
    entities = [Dealer::class],
    version = 1
)
abstract class DealerDatabase : RoomDatabase() {
    abstract fun dealerDao()
}