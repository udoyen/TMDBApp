package com.connect.systems.ng.tmdbapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.connect.systems.ng.tmdbapp.R
import com.connect.systems.ng.tmdbapp.model.Movie
import com.squareup.picasso.Picasso

class MoviesAdapter(movies: List<Movie>, applicationContext: Context?) :
    RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    var movies : List<Movie>? = null
    var rowLayout : Int = R.layout.list_item_movie
    var context : Context? = null
    private val IMAGE_URL_BASE_PATH = "https://image.tmdb.org/t/p/w342//"

    init {
        this.movies = movies
        this.context = applicationContext
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(rowLayout, parent, false)

        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies!!.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val image_url : String = IMAGE_URL_BASE_PATH + movies!![position].posterPath
        // Return an instance of the Picasso class
        val picasso = Picasso.get()
        picasso.load(image_url)
            .placeholder(android.R.drawable.sym_def_app_icon)
            .error(android.R.drawable.sym_def_app_icon)
            .into(holder.movieImage)

        holder.movieTitle!!.text = movies!![position].title
        holder.data!!.text = movies!![position].releaseDate
        holder.moviesDescription!!.text = movies!![position].overview
        holder.rating!!.text = movies!![position].voteAverage.toString()


    }


    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var moviesLayout : LinearLayout? = null
        var movieTitle : TextView? = null
        var data : TextView? = null
        var moviesDescription : TextView? = null
        var rating : TextView? = null
        var movieImage : ImageView? = null

        init {
            moviesLayout = itemView.findViewById(R.id.movies_layout)
            movieImage = itemView.findViewById(R.id.movie_image)
            movieTitle = itemView.findViewById(R.id.title)
            data = itemView.findViewById(R.id.date)
            moviesDescription = itemView.findViewById(R.id.description)
            rating = itemView.findViewById(R.id.rating)

        }

    }


}
