package com.movies.moviesAPI.service

import com.movies.moviesAPI.controller.Movie
import org.springframework.stereotype.Service

@Service
class MovieService : IMovieService {
    override fun getMovies(): List<Movie> {
        return listOf(
                Movie(1, "Titanic", 2, 1950),
                Movie(2, "Moi, moche et méchant", 6, 2010),
                Movie(3, "Ducobu", 1, 2000),
                Movie(4, "Matrix", 8, 1997),
                Movie(5, "Avengers", 12, 2018),
                Movie(6, "Lucas et Alexandre", 2, 2023),
                Movie(7, "Tous au five", 7, 2024),
        )
    }

    override fun getMovieById(id : Int): Movie? {
        val movies : List<Movie> = listOf(
                Movie(1, "Titanic", 2, 1950),
                Movie(2, "Moi, moche et méchant", 6, 2010),
                Movie(3, "Ducobu", 1, 2000),
                Movie(4, "Matrix", 8, 1997),
                Movie(5, "Avengers", 12, 2018),
                Movie(6, "Lucas et Alexandre", 2, 2023),
                Movie(7, "Tous au five", 7, 2024),
        )

        movies.forEach { movie ->
            if (movie.Id == id) {
                return movie
            }
        }
        return null
    }
}