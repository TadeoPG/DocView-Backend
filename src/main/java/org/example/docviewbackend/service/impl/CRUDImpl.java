package org.example.docviewbackend.service.impl;

import org.example.docviewbackend.repository.IGenericRepo;
import org.example.docviewbackend.service.ICRUD;

import java.util.List;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {

    protected abstract IGenericRepo<T, ID> getRepo();

    @Override
    public T save(T t) throws Exception {return getRepo().save(t);}
    @Override
    public T update(T t, ID id) throws Exception {
        getRepo().findById(id)
                .orElseThrow(() -> new RuntimeException("Id not found " + id)); // error en tiempo de ejecucion
        return getRepo().save(t);
    }
    @Override
    public List<T> readAll() throws Exception {
        return getRepo().findAll();
    }
    @Override
    public T readById(ID id) throws Exception {
        return getRepo().findById(id)
                .orElseThrow(() -> new RuntimeException("Id not found " + id)); // error en tiempo de ejecucion
    }
    @Override
    public void delete(ID id) throws Exception {
        getRepo().findById(id)
                .orElseThrow(() -> new RuntimeException("Id not found " + id)); // error en tiempo de ejecucion
        getRepo().deleteById(id);
    };

}
