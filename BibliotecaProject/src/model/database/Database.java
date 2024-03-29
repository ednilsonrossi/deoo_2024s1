package model.database;

import model.User;

import java.util.Set;
import java.util.TreeSet;

public class Database {

    private static Database instance;
    private final Set<User> users;


    public static Database getInstance(){
        if (instance == null)
            instance = new Database();
        return instance;
    }

    public Set<User> getUsers(){
        return users;
    }

    private Database(){
        users = new TreeSet<>();
    }
}
