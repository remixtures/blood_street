package org.academiadecodigo.alphabeat.persistence.daos.mock;

import org.academiadecodigo.alphabeat.persistence.daos.Dao;
import org.academiadecodigo.alphabeat.persistence.model.Model;

import java.util.*;


public abstract class GenericDao<T extends Model> implements Dao<T>{

    protected Class<T> modelType;

    protected Map<Integer, T> modelMap = new HashMap<>();

    protected Integer getNextId() {
        return modelMap.isEmpty() ? 1 : Collections.max(modelMap.keySet()) + 1;
    }

    public GenericDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(modelMap.values());
    }

    @Override
    public T findById(Integer id) {
        return modelMap.get(id);
    }

    @Override
    public T saveOrUpdate(T modelObject) {
        if(modelMap.containsKey(modelObject.getId())){
            modelMap.remove(modelObject.getId());
        }

        return modelMap.put(getNextId(), modelObject);
    }

    @Override
    public void delete(Integer id) {
        modelMap.remove(id);
    }
}
