package com.aniruddha.kudalkar.industryprojectstructure.domain

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Board(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val idOrganization : String,
    val name : String
)