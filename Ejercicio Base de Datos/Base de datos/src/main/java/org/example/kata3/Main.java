package org.example.kata3;

import org.example.kata3.model.Categoria;
import org.example.kata3.model.Producto;
import org.example.kata3.service.ProductoService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductoService productoService = new ProductoService();

        // Crear una categoría ejemplo (debería existir en DB)
        Categoria categoriaEjemplo = new Categoria(1, "Electrónica", "Productos electrónicos");

        // Crear producto nuevo
        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombre("Smartphone");
        nuevoProducto.setDescripcion("Teléfono inteligente de última generación");
        nuevoProducto.setPrecio(15000.00);
        nuevoProducto.setCantidad(10);
        nuevoProducto.setCategoria(categoriaEjemplo);

        try {
            productoService.crear(nuevoProducto);
            System.out.println("Producto creado con ID: " + nuevoProducto.getId());
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear producto: " + e.getMessage());
        }

        // Listar productos
        List<Producto> productos = productoService.listar();
        for (Producto p : productos) {
            System.out.println(p);
        }

        // Actualizar producto
        nuevoProducto.setPrecio(14000);
        productoService.actualizar(nuevoProducto);

        // Leer producto por ID
        Producto productoLeido = productoService.leer(nuevoProducto.getId());
        System.out.println("Producto leído: " + productoLeido);

        // Eliminar producto
        // productoService.eliminar(nuevoProducto.getId());
        // System.out.println("Producto eliminado.");
    }
}

