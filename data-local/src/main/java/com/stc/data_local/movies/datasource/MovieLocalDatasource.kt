package com.stc.data_local.movies.datasource

import com.stc.data_local.common.ICoroutineDispatchers
import com.stc.data_local.movies.dao.MoviesDao
import com.stc.data_local.movies.entities.MovieEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MovieLocalDatasource @Inject constructor(private val dao: MoviesDao, private val coroutineScopeDispatchers: ICoroutineDispatchers
    ) : IMovieLocalDatasource {
    override suspend fun addMovies(item:   List<MovieEntity>) {
        return withContext(coroutineScopeDispatchers.IO){
            dao.addMovies(item)
        }
    }



    override suspend fun getMovies(): Flow<List<MovieEntity>?> {
        return withContext(coroutineScopeDispatchers.IO){
            dao.getMovies()
        }
    }

    override suspend fun getMovie(itemId: Int): MovieEntity? {
        return withContext(coroutineScopeDispatchers.IO){
            dao.loadMovie(itemId.toString())
        }
    }


}