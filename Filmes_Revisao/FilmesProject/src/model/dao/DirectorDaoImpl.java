package model.dao;

import model.entity.Director;

import java.util.ArrayList;
import java.util.List;

public class DirectorDaoImpl implements DirectorDao{

    private static DirectorDaoImpl instance;
    private List<Director> dataset;

    private DirectorDaoImpl() {
        this.dataset = new ArrayList<>();
    }

    public static DirectorDao getInstance(){
        if(instance == null){
            instance = new DirectorDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Director> findAll() {
        return dataset;
    }

    @Override
    public Director findByName(String name) {
        for(Director director : dataset){
            if (director.getName().equals(name)){
                return director;
            }
        }
        return null;
    }

    @Override
    public void insert(Director director) {
        if(director != null){
            for (Director d : dataset){
                if (d.getName().equals(director.getName())){
                    return;
                }
            }
            dataset.add(director);
        }
    }

    @Override
    public void update(Director oldDirector, Director newDirector) {
        Director inDataset = findByName(oldDirector.getName());
        inDataset.setName(newDirector.getName());
    }

    @Override
    public void delete(String name) {
        dataset.remove(findByName(name));
    }
}
