package model.dataset;

import model.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieDataset {
    private static MovieDataset instance;
    private List<Movie> dataset;

    private MovieDataset() {
        this.dataset = new ArrayList<>();
    }

    public static MovieDataset getInstance(){
        if(instance == null){
            instance = new MovieDataset();
        }
        return instance;
    }

    public void addMovie(Movie movie){
        this.dataset.add(movie);
    }

    public boolean deleteMovie(Movie movie){
        return dataset.remove(movie);
    }

    public Movie getMovie(String title){
        for(Movie movie : dataset){
            if (movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }
}
