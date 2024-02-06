package model.service;

import model.dao.ActorDao;
import model.dao.ActorDaoImpl;
import model.entity.Actor;
import java.util.List;

public class ActorService {

    private ActorDao dao;

    public ActorService(){
        dao = ActorDaoImpl.getInstance();
    }

    public List<Actor> getAllActors(){
        return dao.findAll();
    }
}
