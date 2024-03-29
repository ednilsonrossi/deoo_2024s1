package model.dataset;

import model.entity.Director;
import java.util.ArrayList;
import java.util.List;

public class DirectorDataset {
    private static DirectorDataset instance;
    private List<Director> dataset;

    private DirectorDataset() {
        this.dataset = new ArrayList<>();
    }

    public static DirectorDataset getInstance(){
        if(instance == null){
            instance = new DirectorDataset();
        }
        return instance;
    }

    public void addDirector(Director director){
        this.dataset.add(director);
    }

    public boolean deleteDirector(Director director){
        return dataset.remove(director);
    }

    public Director getDirector(String name){
        for(Director director : dataset){
            if (director.getName().equals(name)){
                return director;
            }
        }
        return null;
    }
<<<<<<< HEAD

    public List<Director> getAll(){
        return dataset;
    }
=======
>>>>>>> 5bf0a377a470a89634818f23a9d7bec1e9fda5db
}
