package model.dao;

import model.entity.Movie;

import java.util.List;

public interface MovieDao {

    boolean insertMovie(Movie movie);

    boolean updateMovie(Movie movie);

    boolean deleteByTitle(String title);

    Movie findByTitle(String title);

    List<Movie> findAll();

}
