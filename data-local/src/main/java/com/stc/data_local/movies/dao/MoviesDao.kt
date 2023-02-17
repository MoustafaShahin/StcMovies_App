package com.stc.data_local.movies.dao

import androidx.room.*
import com.stc.data_local.movies.entities.MovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MoviesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMovies(item:List<MovieEntity>)

    @Query("Select * From Movies Order BY release_date Desc")
    fun getMovies(): Flow<List<MovieEntity>?>

    @Query("SELECT * FROM Movies WHERE id=:arg0")
    fun loadMovie(id: String): MovieEntity
}