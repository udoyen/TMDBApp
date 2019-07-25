package com.connect.systems.ng.tmdbapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.connect.systems.ng.tmdbapp.R
import com.connect.systems.ng.tmdbapp.adapter.MoviesAdapter
import com.connect.systems.ng.tmdbapp.model.Movie
import com.connect.systems.ng.tmdbapp.model.MovieResponse
import com.connect.systems.ng.tmdbapp.rest.MovieApiService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private val TAG : String = MainActivity::class.java.simpleName
    val BASE_URL : String = "http://api.themoviedb.org/3/"
    private var retrofit : Retrofit? = null
    private var recyclerView : RecyclerView? = null
    private var API_KEY : String = "166873e095bdb281691220d5ad12610c"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // setup the layout manager
        recycler_view.setHasFixedSize(true)
        recycler_view.layoutManager = LinearLayoutManager(this)

        // get the data
        connectAndGetApiData()

    }

    /**
     * This method creates an instance of Retrofit
     * and set the base url
     */
    private fun connectAndGetApiData() {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val movieApiService = retrofit!!.create(MovieApiService::class.java)

        val call : Call<MovieResponse> = movieApiService!!.getTopRatedMovies(API_KEY)
        call.enqueue(object : Callback<MovieResponse> {
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                Log.e(TAG, t.toString())
            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                val movies : List<Movie> = response.body()!!.results!!
                recyclerView!!.adapter = MoviesAdapter(movies, R.layout.list_item_movie, applicationContext)
                Log.d(TAG, "Number of movies received: " + movies.size)
            }
        })


    }
}
