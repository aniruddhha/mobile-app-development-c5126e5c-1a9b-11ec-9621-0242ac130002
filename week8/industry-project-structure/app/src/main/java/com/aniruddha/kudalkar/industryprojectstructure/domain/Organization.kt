package com.aniruddha.kudalkar.industryprojectstructure.domain

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Organization(
    @PrimaryKey(autoGenerate = true)
    var id : Long,
    var displayName : String,
    var desc : String
)