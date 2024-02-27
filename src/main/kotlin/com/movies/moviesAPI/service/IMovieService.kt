package com.movies.moviesAPI.service

import com.movies.moviesAPI.controller.Movie

interface IMovieService {
    fun getMovies() : List<Movie>

    fun getMovieById(id : Int): Movie
}