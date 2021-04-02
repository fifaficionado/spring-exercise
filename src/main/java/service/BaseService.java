package service;

import repo.BaseRepo;

import java.io.Serializable;

/**
 *
 * @param <T>
 * @param <ID>
 */
public abstract class BaseService<T, ID extends Serializable> {

    public T getById(ID id) {
        // TODO implement
        return null;
    }

    public Iterable<T> getAll() {
        // TODO implement
        return null;
    }

    public void removeById(ID id) {
        // TODO implement
    }

    public T save(ID id, T t) {
        // TODO implement
        return null;
    }

    // injected
    BaseRepo<T, ID> repo;
}
