package controller;

import dto.MovieDto;
import model.entity.Actor;
import model.entity.Director;
import model.entity.Movie;
import model.service.MovieService;

import java.util.ArrayList;
import java.util.List;

public class MovieController {

    private MovieService service;

    public MovieController(){
        service = new MovieService();
    }

    public boolean save(MovieDto movieDto){
        var movie = movieDto.toDomain();
        return service.save(movie);
    }

    public List<MovieDto> getAllMovies(){
        List<Movie> movies = service.allMovies();
        List<MovieDto> moviesDto = new ArrayList<>();
        for(Movie movie : movies){
            moviesDto.add(new MovieDto(movie));
        }
        return moviesDto;
    }

    public List<MovieDto> getMoviesFromDirector(String directorName){
        List<MovieDto> moviesDto = new ArrayList<>();
        for(Movie movie : service.allMoviesFromDirector(new Director(directorName))){
            moviesDto.add(new MovieDto(movie));
        }
        return moviesDto;
    }

    public List<MovieDto> getMoviesFromActor(String actorName){
        List<MovieDto> moviesDto = new ArrayList<>();
        for(Movie movie : service.allMoviesFromActor(new Actor(actorName, 0))){
            moviesDto.add(new MovieDto(movie));
        }
        return moviesDto;
    }

    public List<MovieDto> getMoviesFromMark(int minimumMark){
        List<MovieDto> moviesDto = new ArrayList<>();
        for(Movie movie : service.allMoviesFromMinimumMark(minimumMark)){
            moviesDto.add(new MovieDto(movie));
        }
        return moviesDto;
    }
}
