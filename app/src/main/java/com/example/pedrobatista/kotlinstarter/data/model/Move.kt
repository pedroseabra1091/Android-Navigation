package com.example.pedrobatista.androidnavigation.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Move(
        @PrimaryKey(autoGenerate = false)
        var id: Int,
        var name: String,
        var progressions: List<Progression>
)
