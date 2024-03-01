package com.movies.moviesAPI.controller

import com.movies.moviesAPI.service.IMovieService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.time.Month

data class Movie(val Id : Int, val name : String, val month: Int, val year : Int)

@RestController
@Validated
class MovieController(val movieService : IMovieService) {

    @GetMapping("api/v1/movies")
    fun getMovies() = movieService.getMovies()

    @GetMapping("api/v1/movies/{movieId}")
    fun getMovieById(@PathVariable movieId : Int) = movieService.getMovieById(movieId)

}