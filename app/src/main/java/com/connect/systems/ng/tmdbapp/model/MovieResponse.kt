package com.connect.systems.ng.tmdbapp.model

import com.google.gson.annotations.SerializedName

class MovieResponse {

    @SerializedName("page")
    var page : Int? = null

    @SerializedName("results")
    var results : List<Movie>? = null

    @SerializedName("total_results")
    var totalResults : Int? = null

    @SerializedName("total_pages")
    var totalPages : Int? = null

    constructor(page: Int?, results: List<Movie>?, totalResults: Int?, totalPages: Int?) {
        this.page = page
        this.results = results
        this.totalResults = totalResults
        this.totalPages = totalPages
    }


}