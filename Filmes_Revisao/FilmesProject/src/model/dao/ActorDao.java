package model.dao;

import model.entity.Actor;

import java.util.List;

public interface ActorDao {

    List<Actor> findAll();

    Actor findByName(String name);

    void insert(Actor actor);

    void updateByName(String name, Actor actor);

    void delete(String name);
}
