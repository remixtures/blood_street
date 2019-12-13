package org.academiadecodigo.alphabeat.persistence.daos;

import org.academiadecodigo.alphabeat.persistence.model.Model;

import java.util.List;

/**
 * Created by codecadet on 13/12/2019.
 */
public interface Dao<T extends Model> {

    List<T> findAll();

    T findById(Integer id);

    T saveOrUpdate(T modelObject);

    void delete(Integer id);
}
