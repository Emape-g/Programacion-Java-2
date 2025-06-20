package org.example.kata4.dao;

import java.util.List;

public interface GenericDAO<T> {
    void crear(T t);
    T leer(int id);
    void actualizar(T t);
    void eliminar(int id);
    List<T> listar();

    boolean existeCategoria(int idCategoria);

}
