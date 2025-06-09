package org.example.kata4.service;



import org.example.kata3.dao.ProductoDAO;
import org.example.kata3.model.Producto;

import java.util.List;

public class ProductoService implements GenericService<Producto> {

    private ProductoDAO dao = new ProductoDAO();

    @Override
    public void crear(Producto p) {
        validarProducto(p);
        if (!dao.existeCategoria(p.getCategoria().getId())) {
            throw new IllegalArgumentException("La categoría no existe");
        }
        dao.crear(p);
    }

    @Override
    public Producto leer(int id) {
        return dao.leer(id);
    }

    @Override
    public void actualizar(Producto p) {
        validarProducto(p);
        if (!dao.existeCategoria(p.getCategoria().getId())) {
            throw new IllegalArgumentException("La categoría no existe");
        }
        dao.actualizar(p);
    }

    @Override
    public void eliminar(int id) {
        dao.eliminar(id);
    }

    @Override
    public List<Producto> listar() {
        return dao.listar();
    }

    public List<Producto> listarPorCategoria(int idCategoria) {
        return dao.listarPorCategoria(idCategoria);
    }

    private void validarProducto(Producto p) {
        if (p.getNombre() == null || p.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (p.getPrecio() <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero");
        }
        if (p.getCantidad() < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        if (p.getCategoria() == null) {
            throw new IllegalArgumentException("Debe asignar una categoría");
        }
    }
}