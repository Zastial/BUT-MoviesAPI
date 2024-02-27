package com.movies.moviesAPI.service

import com.movies.moviesAPI.controller.Movie
import org.springframework.stereotype.Service

@Service
class MovieService : IMovieService {
    override fun getMovies(): List<Movie> {
        return listOf(
                Movie(1, "Titanic", "2024-02-27"),
                Movie(2, "Moi, moche et méchant", "2021-12-05"),
                Movie(3, "Ducobu", "2003-02-11"),
                Movie(4, "Matrix", "2006-08-27"),
                Movie(5, "Avengers", "2020-11-01"),
                Movie(6, "Lucas et Alexandre", "2024-01-31"),
                Movie(7, "Tous au five", "2012-06-09"),
        )
    }

    override fun getMovieById(id : Int): Movie {
        val movies : List<Movie> = listOf(
                Movie(1, "Titanic", "2024-02-27"),
                Movie(2, "Moi, moche et méchant", "2021-12-05"),
                Movie(3, "Ducobu", "2003-02-11"),
                Movie(4, "Matrix", "2006-08-27"),
                Movie(5, "Avengers", "2020-11-01"),
                Movie(6, "Lucas et Alexandre", "2024-01-31"),
                Movie(7, "Tous au five", "2012-06-09"),
        )

        val movieById = movies.filter { it.Id == id }
        return movieById[0]
    }
}