package model.service;

import model.dao.DirectorDao;
import model.dao.DirectorDaoImpl;
import model.entity.Director;

import java.util.List;

public class DirectorService {

    private DirectorDao dao;

    public DirectorService(){
        dao = DirectorDaoImpl.getInstance();
    }

    public List<Director> allDirectors(){
        return dao.findAll();
    }
}
