package model.dao;

import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDaoMapImpl implements UserDao{

    private static UserDaoMapImpl instance = null;
    private Map<String, User> userMap;

    private UserDaoMapImpl(){
        userMap = new HashMap<>();
    }

    public static UserDaoMapImpl getInstance(){
        return instance == null ? new UserDaoMapImpl() : instance;
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public boolean insert(User user) {
        userMap.put(user.getUsername(), user);
        return true;
    }

    @Override
    public User getByUsername(String username) {
        return userMap.get(username);
    }
}
