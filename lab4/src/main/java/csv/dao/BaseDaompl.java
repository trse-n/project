package csv.dao;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

public class BaseDaompl<T, id extends Serializable> extends AbstractDao implements BaseDao<T, id> {

    public BaseDaompl(Class clz) {
        super(clz);
        openSession();
    }

    @Override
    public void save(T entity) {
        Transaction t = getSession().beginTransaction();
        getSession().save(entity);
        t.commit();
    }

    @Override
    public void update(T entity) {
        Transaction t = getSession().beginTransaction();
        getSession().update(entity);
        t.commit();
    }

    @Override
    public T findOne(Id id) {
        Query q = getSession().createQuery("FROM " + getClz().getName());
        return (T) q.getSingleResult();
    }

    @Override
    public List<T> findAll() {
        Query q = getSession().createQuery("FROM " + getClz().getName());
        return q.list();
    }

    @Override
    public void delete(T entity) {
        Transaction t = getSession().beginTransaction();
        getSession().delete(entity);
        t.commit();
    }

    @Override
    public void deleteAll() {

    }
}
