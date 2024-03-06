package model.service;

import model.dao.*;
import model.entity.Actor;
import model.entity.Director;
import model.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private ActorDao actorDao;
    private DirectorDao directorDao;
    private MovieDao movieDao;

    public MovieService(){
        actorDao = ActorDaoImpl.getInstance();
        directorDao = DirectorDaoImpl.getInstance();
        movieDao = MovieDaoImpl.getInstance();
    }

    public boolean save(Movie movie){
        if(movie != null){
            for(Actor actor : movie.getActors()){
                actorDao.insert(actor);
            }

            directorDao.insert(movie.getDirector());

            movieDao.insertMovie(movie);
            return true;
        }
        return false;
    }

    public List<Movie> allMovies(){
        return movieDao.findAll();
    }

    public List<Movie> allMoviesFromDirector(Director director){
        List<Movie> list = new ArrayList<>();
        for(Movie m : movieDao.findAll()){
            if (m.getDirector().getName().equals(director.getName())){
                list.add(m);
            }
        }
        return list;
    }

    public List<Movie> allMoviesFromActor(Actor actor){
        List<Movie> list = new ArrayList<>();
        for(Movie m : movieDao.findAll()){
            for(Actor a : m.getActors()){
                if(a.getName().equals(actor.getName())){
                    list.add(m);
                    break;
                }
            }
        }
        return list;
    }

    public List<Movie> allMoviesFromMinimumMark(int mark){
        List<Movie> list = new ArrayList<>();
        for(Movie m : movieDao.findAll()){
            if(m.getMark() >= mark){
                list.add(m);
            }
        }
        return list;
    }
}
