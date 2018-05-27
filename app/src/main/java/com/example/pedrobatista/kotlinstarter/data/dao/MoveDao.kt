package com.example.pedrobatista.androidnavigation.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.pedrobatista.androidnavigation.data.model.Move

@Dao
interface MoveDao {
    @Query("SELECT * FROM  move")
    fun getAllMoves(): List<Move>

    @Insert
    fun insert(move: Move)
}
