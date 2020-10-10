package ir.maktab39.base.repository;

import javax.persistence.NoResultException;
import java.io.Serializable;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public interface BaseRepository<PK extends Serializable, E> {

    Class<E> getEntityClass();

    void startTransaction();

    void commit();

    void rollback();

    E save(E e);

    E find(PK id) throws NoResultException;

    void removeById(PK id) throws NoResultException;

    E update(E e);

    List<E> findAll();

    List<E> findAll(Predicate<E> predicate);

    <R> List<R> findAll(Function<E, R> function);
}
