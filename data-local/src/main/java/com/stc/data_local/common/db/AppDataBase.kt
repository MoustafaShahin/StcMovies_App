package com.stc.data_local.common.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.stc.data_local.movies.dao.MoviesDao
import com.stc.data_local.movies.entities.MovieEntity
import com.stc.data_local.common.Const.DB_VERSION
import com.stc.data_local.common.converter.IntListConverter

@TypeConverters(IntListConverter::class)
@Database(entities = [MovieEntity::class], version = DB_VERSION, exportSchema = false)
abstract class AppDataBase :RoomDatabase() {

    abstract fun moviesDao(): MoviesDao
}