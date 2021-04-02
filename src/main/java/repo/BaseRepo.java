package repo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Base class of a repository for storing entities of class {@code T} and id {@code ID}.
 *
 * @param <T> type parameter for entity
 * @param <ID> type parameter for entity identifier
 */
public abstract class BaseRepo<T, ID extends Serializable> {

    private Map<ID, T> datastore = new HashMap<>();

    public T findById(ID id) {
        // TODO implement
        return null;
    }

    public Iterable<T> findAll() {
        // TODO implement
        return null;
    }

    public void deleteById(ID id) {
        // TODO implement
    }

    public T persist(ID id, T t) {
        // TODO implement
        return t;
    }
}