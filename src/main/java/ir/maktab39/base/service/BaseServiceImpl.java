package ir.maktab39.base.service;

import ir.maktab39.ComponentFactory;
import ir.maktab39.ErrorHandler;
import ir.maktab39.base.repository.BaseRepository;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class BaseServiceImpl
        <PK extends Serializable, E, Repository extends BaseRepository<PK, E>>
        implements BaseService<E, PK> {


    protected Repository repository;

    public BaseServiceImpl(Class<? extends Repository> repositoryClass) {
        try {
            this.repository = (Repository) ComponentFactory.
                    getSingletonObject(repositoryClass);
        } catch (Exception e) {
            ErrorHandler.showMessage(e);
        }
    }

    @Override
    public E save(E e) {
        return repository.save(e);
    }

    @Override
    public E findById(PK id) {
        return repository.find(id);
    }

    @Override
    public void deleteById(PK id) {
        repository.removeById(id);
    }

    @Override
    public E update(E e) {
        return repository.update(e);
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Override
    public List<E> findAll(Predicate<E> predicate) {
        return repository.findAll(predicate);
    }

    @Override
    public List findAll(Function<E, ?> function) {
        return repository.findAll(function);
    }


}
