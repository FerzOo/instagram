package ir.maktab39.base.service;

import ir.maktab39.exceptions.NoEntityFoundException;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public interface BaseService <E, PK extends Serializable>{

    E save(E e);

    E findById(PK id) throws NoEntityFoundException;

    void deleteById(PK id)throws NoEntityFoundException;

    E update(E e);

    List<E> findAll();

    List<E> findAll(Predicate<E> predicate);

    List findAll(Function<E, ?> function);

}