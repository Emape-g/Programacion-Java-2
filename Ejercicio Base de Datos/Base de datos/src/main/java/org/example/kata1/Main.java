package org.example.kata1;

public class Main {
    public static void main(String[] args) {
        GestorCategorias gestor = new GestorCategorias();

        gestor.agregarCategoria("Tecnología", "Categoría de productos tecnológicos");
        gestor.listarCategorias();
        gestor.mostrarCategoria(1);
        gestor.actualizarCategoria(1, "Electrónica", "Productos electrónicos actualizados");
        gestor.eliminarCategoria(1);
    }
}

