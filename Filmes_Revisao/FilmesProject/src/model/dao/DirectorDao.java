package model.dao;

import model.entity.Director;

import java.util.List;

public interface DirectorDao {

    List<Director> findAll();

    Director findByName(String name);

    void insert(Director director);

    void update(Director oldDirector, Director newDirector);

    void delete(String name);

}
