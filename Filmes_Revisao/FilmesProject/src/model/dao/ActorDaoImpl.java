package model.dao;

import model.entity.Actor;

import java.util.ArrayList;
import java.util.List;

public class ActorDaoImpl implements ActorDao{

    private static ActorDaoImpl instance;
    private List<Actor> actorList;

    private ActorDaoImpl(){
        actorList = new ArrayList<>();
    }

    public static ActorDao getInstance(){
        if(instance == null){
            instance = new ActorDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Actor> findAll() {
        return actorList;
    }

    @Override
    public Actor findByName(String name) {
        for (Actor a : actorList){
            if(a.getName().equals(name)){
                return a;
            }
        }
        return null;
    }

    @Override
    public void insert(Actor actor) {
        if(actor != null){
            if(findByName(actor.getName()) == null){
                actorList.add(actor);
            }
        }
    }

    @Override
    public void updateByName(String name, Actor actor) {
        int index = 0;
        for(Actor inDataset : actorList){
            if (inDataset.getName().equals(name)){
                actorList.set(index, actor);
                return;
            }
            index++;
        }
    }

    @Override
    public void delete(String name) {
        for(Actor inDataset : actorList){
            if (inDataset.getName().equals(name)){
                actorList.remove(inDataset);
                return;
            }
        }
    }
}
