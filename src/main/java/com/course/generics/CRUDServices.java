package com.course.generics;

import java.util.List;

/**
 * CRUDServices
 *
 * @author cleison.melo
 * @version 1.0
 */

public interface CRUDServices<T> {
    /**
     * @param entity
     * @return
     */
    public T create(T entity);

    /**
     * @param entity
     * @param id
     * @return
     */
    public Boolean update(T entity, Integer id);

    /**
     * @param id
     * @return
     */
    public Boolean delete(Integer id);

    /**
     * @param id
     * @return
     */
    public T getById(Integer id);

    /**
     * @return
     */
    public List<T> getAll();
}
