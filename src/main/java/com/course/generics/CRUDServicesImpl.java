package com.course.generics;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * CRUDServicesImpl
 *
 * @author cleison.melo
 * @version 1.0
 */
public abstract class CRUDServicesImpl<T> implements CRUDServices<T> {

    private Class<T> entityClass;

    public CRUDServicesImpl() {
        entityClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /**
     * @param entity
     * @return
     */
    public T create(T entity) {
        return entity;
    }

    /**
     * @param entity
     * @param id
     * @return
     */
    public Boolean update(T entity, Integer id) {
        return true;
    }

    /**
     * @param id
     * @return
     */
    public Boolean delete(Integer id) {
        return true;
    }

    /**
     * @param id
     * @return
     */
    public T getById(Integer id) {
        return (T) entityClass;
    }

    /**
     * @return
     */
    public List<T> getAll() {
        List<T> listEntity = new ArrayList<T>();
        return listEntity;
    }
}
