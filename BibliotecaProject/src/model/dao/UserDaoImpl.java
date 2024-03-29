package model.dao;

import model.User;
import model.database.Database;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao<String, User>{

    private final Database database;

    public UserDaoImpl(){
        database = Database.getInstance();
    }

    @Override
    public boolean insert(User element) {
        return database.getUsers().add(element);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(database.getUsers());
    }

    @Override
    public User findById(String key) {
        for(User user : database.getUsers()){
            if (user.getEmail().equals(key)){
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String key) {
        return database.getUsers().remove(findById(key));
    }

    @Override
    public boolean update(String key, User element) {
        User user = findById(key);
        if(user != null){
            database.getUsers().remove(user);
            database.getUsers().add(element);
            return true;
        }
        return false;
    }

    @Override
    public List<User> findByName(String name) {
        List<User> userList = new ArrayList<>();
        for(User user : database.getUsers()){
            if(user.getName().equals(name)){
                userList.add(user);
            }
        }
        return userList;
    }
}
