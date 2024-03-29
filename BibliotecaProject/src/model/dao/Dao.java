package model.dao;

import java.util.List;

public interface Dao <K, T>{

    boolean insert(T element);

    List<T> findAll();

    T findById(K key);

    boolean delete(K key);

    boolean update(K key, T element);
}
