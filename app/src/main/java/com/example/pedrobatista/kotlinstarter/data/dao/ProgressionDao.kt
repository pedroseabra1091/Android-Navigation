package com.example.pedrobatista.androidnavigation.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.pedrobatista.androidnavigation.data.model.Progression

@Dao
interface ProgressionDao {
    @Query("SELECT * FROM progression")
    fun getAllProgress(moveId: Int): List<Progression>

    @Insert
    fun insert(progressionId: Int, progression: Progression)
}