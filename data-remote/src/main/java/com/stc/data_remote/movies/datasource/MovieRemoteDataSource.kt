package com.stc.data_remote.movies.datasource

import com.stc.data_remote.common.ICoroutineDispatchers
import com.stc.data_remote.common.NetworkUtil
import com.stc.data_remote.movies.dto.MoviesListDTO
import com.stc.data_remote.movies.service.MoviesServicesApi
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MovieRemoteDataSource @Inject constructor (
    private val api: MoviesServicesApi,
    private val coroutineScopeDispatchers: ICoroutineDispatchers
    ): IMovieRemoteDataSource {

    override suspend fun getPopularMovies(page: Int): MoviesListDTO? {
        return withContext(coroutineScopeDispatchers.IO){
            NetworkUtil.processAPICall { api.popularMovies(page) }
        }
    }

    override suspend fun getTopRatedMovies(page: Int): MoviesListDTO? {
        return withContext(coroutineScopeDispatchers.IO){
            NetworkUtil.processAPICall { api.topRatedMovies(page) }
        }
    }

    override suspend fun getNowPlayingMovies(page: Int): MoviesListDTO? {
        return withContext(coroutineScopeDispatchers.IO){
            NetworkUtil.processAPICall { api.nowPlayingMovies(page) }
        }
    }
}