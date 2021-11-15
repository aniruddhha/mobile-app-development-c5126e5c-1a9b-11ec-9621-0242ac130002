package com.aniruddha.kudalkar.industryprojectstructure.domain

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Organization(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val displayName : String,
    val desc : String
)