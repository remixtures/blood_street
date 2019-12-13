package org.academiadecodigo.alphabeat.persistence.daos.mock;

import org.academiadecodigo.alphabeat.persistence.daos.Dao;
import org.academiadecodigo.alphabeat.persistence.model.Model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by codecadet on 13/12/2019.
 */
public abstract class GenericDao<T extends Model> implements Dao<T>{

    protected Class<T> modelType;

    public void setModelType(Class<T> modelType) {
        this.modelType = modelType;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T findById(Integer id) {
        return null;
    }

    @Override
    public T saveOrUpdate(T modelObject) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
