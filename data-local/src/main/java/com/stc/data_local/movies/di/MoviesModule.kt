package com.stc.data_local.movies.di

import com.stc.data_local.movies.dao.MoviesDao
import com.stc.data_local.movies.datasource.IMovieLocalDatasource
import com.stc.data_local.movies.datasource.MovieLocalDatasource
import com.stc.data_local.common.ICoroutineDispatchers
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object MoviesModule {

    @Singleton
    @Provides
    fun provideMoviesLocalDataSource(moviesDao: MoviesDao, coroutineDispatchers: ICoroutineDispatchers): IMovieLocalDatasource {
        return MovieLocalDatasource(moviesDao,coroutineDispatchers)
    }

}