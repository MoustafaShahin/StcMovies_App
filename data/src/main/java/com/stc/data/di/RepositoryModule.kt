package com.stc.data.di

import com.stc.data.repository.IMovieRepository
import com.stc.data.repository.MovieRepository
import com.stc.data_local.movies.datasource.IMovieLocalDatasource
import com.stc.data_remote.movies.datasource.IMovieRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(remoteDataSource: IMovieRemoteDataSource,localDatasource: IMovieLocalDatasource): IMovieRepository {
        return MovieRepository(remoteDataSource,localDatasource)
    }

}