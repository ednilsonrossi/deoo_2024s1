package model.dao;

import model.User;

import java.util.*;

public class UserDaoSetImpl implements UserDao{

    private static UserDaoSetImpl instance = null;
    private Set<User> userSet;

    private UserDaoSetImpl(){
        userSet = new LinkedHashSet<>();
    }

    public static UserDaoSetImpl getInstance(){
        return instance == null ? new UserDaoSetImpl() : instance;
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(userSet);
    }

    @Override
    public boolean insert(User user) {
        return userSet.add(user);
    }

    @Override
    public User getByUsername(String username) {
        for (User u : userSet){
            if(u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }
}
