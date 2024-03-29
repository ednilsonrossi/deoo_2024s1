package model.dao;

import java.util.List;

public interface UserDao<K, T> extends Dao<K, T>{

    List<T> findByName(String name);

}
