package org.example.kata2;

import org.example.kata2.model.Categoria;
import org.example.kata2.service.CategoriaService;


public class Main {
    public static void main(String[] args) {
        CategoriaService servicio = new CategoriaService();

        Categoria nueva = new Categoria("Videojuegos", "Categoría de consolas y juegos");
        servicio.crear(nueva);

        System.out.println("\n📋 Lista de categorías:");
        servicio.listar().forEach(System.out::println);
    }
}
