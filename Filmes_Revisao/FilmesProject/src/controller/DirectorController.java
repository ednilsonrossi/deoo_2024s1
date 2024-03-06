package controller;

import model.entity.Director;
import model.service.DirectorService;

import java.util.ArrayList;
import java.util.List;

public class DirectorController {

    private DirectorService service;

    public DirectorController(){
        service = new DirectorService();
    }

    public List<String> allDirectors(){
        List<String> directorsNames = new ArrayList<>();
        for(Director director : service.allDirectors()){
            directorsNames.add(director.getName());
        }

        return directorsNames;
    }
}
