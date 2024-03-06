package model.dao;

import model.User;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private static UserDaoImpl instance;
    private List<User> userList;

    private UserDaoImpl(){
        userList = new LinkedList<>();
    }

    public static UserDaoImpl getInstance(){
        if(instance == null)
            instance = new UserDaoImpl();
        return instance;
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public boolean insert(User user) {
        if(userList.contains(user)){
            return false;
        }
//        for(User u : userList){
//            if(u.equals(user)){
//                return false;
//            }
//        }
        userList.add(user);
        Collections.sort(userList);
        return true;
    }

    @Override
    public User getByUsername(String username) {
        for(User u : userList){
            if(u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }
}
