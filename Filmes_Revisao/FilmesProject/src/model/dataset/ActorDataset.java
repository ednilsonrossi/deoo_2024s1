package model.dataset;

import model.entity.Actor;

import java.util.ArrayList;
import java.util.List;

public class ActorDataset {
    private static ActorDataset instance = null;
    private List<Actor> dataset;

    private ActorDataset(){
        dataset = new ArrayList<>();
    }

    public static ActorDataset getInstance(){
        if(instance == null){
            instance = new ActorDataset();
        }
        return instance;
    }

    public void addActor(Actor actor){
        this.dataset.add(actor);
    }

    public boolean deleteActor(Actor actor){
        return dataset.remove(actor);
    }

    public Actor getActor(String name){
        for(Actor actor : dataset){
            if (actor.getName().equals(name)){
                return actor;
            }
        }
        return null;
    }
}
