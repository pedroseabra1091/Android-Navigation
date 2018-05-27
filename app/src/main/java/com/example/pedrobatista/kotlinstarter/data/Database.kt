package com.example.pedrobatista.androidnavigation.data

import android.arch.persistence.room.RoomDatabase
import com.example.pedrobatista.androidnavigation.data.dao.MoveDao

abstract class Database : RoomDatabase() {
    abstract fun moveDao() : MoveDao
}