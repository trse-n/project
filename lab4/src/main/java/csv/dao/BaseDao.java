package csv.dao;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

public interface BaseDao<T, id extends Serializable> {
    void save(T entity);

    void update(T entity);

    T findOne(Id id);

    List<T> findAll();

    void delete(T entity);

    void deleteAll();

}
