package com.connect.systems.ng.tmdbapp.model

import com.google.gson.annotations.SerializedName

class Movie {
    // These fields represent the returned
    // fields from the json response
    @SerializedName("poster_path")
    var posterPath : String? = null

    @SerializedName("adult")
    var adult : Boolean? = null

    @SerializedName("overview")
    var overview : String? = null

    @SerializedName("release_date")
    var releaseDate : String? = null


    // Empty arraylist
    @SerializedName("genre_ids")
    var genreIds : ArrayList<Int>? = null

    @SerializedName("id")
    var id : Int? = null

    @SerializedName("originL_title")
    var orginalTitle : String? = null

    @SerializedName("original_language")
    var originalLanguage : String? = null

    @SerializedName("title")
    var title : String? = null

    @SerializedName("backdrop_path")
    var backdropPath : String? = null

    @SerializedName("popularity")
    var popularity : Double? = null

    @SerializedName("vote_count")
    var voteCount : Int? = null

    @SerializedName("vote_average")
    var voteAverage : Double? = null

    @SerializedName("video")
    var video : Boolean? = null

    constructor(posterPath: String?, adult: Boolean?, overview: String?, releaseDate: String?, genreIds: ArrayList<Int>?, id: Int?,
        orginalTitle: String?, originalLanguage: String?, title: String?, backdropPath: String?, popularity: Double?, voteCount: Int?,
        voteAverage: Double?, video: Boolean? ) {
        this.posterPath = posterPath
        this.adult = adult
        this.overview = overview
        this.releaseDate = releaseDate
        this.genreIds = genreIds
        this.id = id
        this.orginalTitle = orginalTitle
        this.originalLanguage = originalLanguage
        this.title = title
        this.backdropPath = backdropPath
        this.popularity = popularity
        this.voteCount = voteCount
        this.voteAverage = voteAverage
        this.video = video
    }




}