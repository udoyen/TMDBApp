package com.connect.systems.ng.tmdbapp.model

import com.google.gson.annotations.SerializedName

class Movie {
    // These fields represent the returned
    // fields from the json response
    @SerializedName("poster_path")
    private var posterPath : String? = null

    @SerializedName("adult")
    private var adult : Boolean? = null

    @SerializedName("overview")
    private var overview : String? = null

    @SerializedName("release_date")
    private var releaseDate : String? = null


    // Empty arraylist
    @SerializedName("genre_ids")
    private var genreIds : ArrayList<Int>? = null

    @SerializedName("id")
    private var id : Int? = null

    @SerializedName("originL_title")
    private  var orginalTitle : String? = null

    @SerializedName("original_language")
    private var originalLanguage : String? = null

    @SerializedName("title")
    private var title : String? = null

    @SerializedName("backdrop_path")
    private var backdropPath : String? = null

    @SerializedName("popularity")
    private var popularity : Double? = null

    @SerializedName("vote_count")
    private  var voteCount : Int? = null

    @SerializedName("vote_average")
    private var voteAverage : Double? = null

    @SerializedName("video")
    private var video : Boolean? = null

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