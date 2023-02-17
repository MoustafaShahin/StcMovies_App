package com.stc.data_remote.movies.datasource

import com.stc.data_remote.movies.dto.MoviesListDTO

interface IMovieRemoteDataSource {
    suspend fun getPopularMovies(page:Int): MoviesListDTO?
    suspend fun getTopRatedMovies(page:Int): MoviesListDTO?
    suspend fun getNowPlayingMovies(page:Int): MoviesListDTO?
}