package com.stc.data_local.movies.datasource

import com.stc.data_local.movies.entities.MovieEntity
import kotlinx.coroutines.flow.Flow


interface IMovieLocalDatasource {
    suspend fun addMovies(item: List<MovieEntity>)
    suspend fun getMovies(): Flow<List<MovieEntity>?>
    suspend fun getMovie(itemId: Int): MovieEntity?
}