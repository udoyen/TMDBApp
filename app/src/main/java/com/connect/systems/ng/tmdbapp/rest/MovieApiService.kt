package com.connect.systems.ng.tmdbapp.rest

import com.connect.systems.ng.tmdbapp.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {

    @GET("movie/top_rated")
    fun getTopRatedMovies(@Query("api_key") apiKey : String) : Call<MovieResponse>

}