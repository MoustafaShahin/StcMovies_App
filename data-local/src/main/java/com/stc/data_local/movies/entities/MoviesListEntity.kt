package com.stc.data_local.movies.entities

import androidx.annotation.Keep

@Keep
data class MoviesListEntity(
    val page: Int?,
    val results: List<MovieEntity>?,
    val total_pages: Int?,
    val total_results: Int?
)