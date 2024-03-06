package model.dao;

import model.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieDaoImpl implements MovieDao{

    private static MovieDaoImpl instance;
    private List<Movie> dataset;

    private MovieDaoImpl(){
        dataset = new ArrayList<>();
    }

    public static MovieDaoImpl getInstance(){
        if(instance == null){
            instance = new MovieDaoImpl();
        }
        return instance;
    }

    @Override
    public boolean insertMovie(Movie movie) {
        if(movie != null){
            for(Movie m : dataset){
                if(m.getTitle().equals(movie.getTitle())){
                    return false;
                }
            }
            dataset.add(movie);
        }
        return false;
    }

    @Override
    public boolean updateMovie(Movie movie) {
        int index = 0;
        for(Movie m : dataset){
            if(m.getTitle().equals(movie.getTitle())){
                dataset.set(index, movie);
                return true;
            }
            index += 1;
        }
        return false;
    }

    @Override
    public boolean deleteByTitle(String title) {
        var inDataset = findByTitle(title);
        return dataset.remove(inDataset);
    }

    @Override
    public Movie findByTitle(String title) {
        for(Movie m : dataset){
            if(m.getTitle().equals(title)){
                return m;
            }
        }
        return null;
    }

    @Override
    public List<Movie> findAll() {
        return dataset;
    }
}
