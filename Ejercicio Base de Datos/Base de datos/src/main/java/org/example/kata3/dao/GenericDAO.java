package org.example.kata3.dao;

import org.example.kata3.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {
    void crear(T t);
    T leer(int id);
    void actualizar(T t);
    void eliminar(int id);
    List<T> listar();

    boolean existeCategoria(int idCategoria);

}
