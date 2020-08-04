package com.example.recyclerdatabindingcoroutines.data.repositories

import com.example.recyclerdatabindingcoroutines.data.network.MoviesApi

class MoviesRepository(
    private val api: MoviesApi
) : SafeApiRequest() {

    suspend fun getMovies() = apiRequest { api.getMovies() }

}