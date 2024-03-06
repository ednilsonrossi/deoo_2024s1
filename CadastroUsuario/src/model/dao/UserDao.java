package model.dao;

import model.User;
import model.UserPersistence;

import java.util.List;

public interface UserDao {
    List<User> getAll();

    boolean insert(User user);

    User getByUsername(String username);
}
