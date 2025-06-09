package org.example.kata1;

import org.example.kata2.model.Categoria;

import java.sql.*;

public class GestorCategorias {

    public void agregarCategoria(String nombre, String descripcion) {
        if (existeCategoria(nombre)) {
            System.out.println("❌ Ya existe una categoría con ese nombre.");
            return;
        }

        String sql = "INSERT INTO categorias (nombre, descripcion) VALUES (?, ?)";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.executeUpdate();
            System.out.println("✅ Categoría agregada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Categoria mostrarCategoria(int id) {
        String sql = "SELECT * FROM categorias WHERE id = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Descripción: " + rs.getString("descripcion"));
            } else {
                System.out.println("❌ Categoría no encontrada.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void listarCategorias() {
        String sql = "SELECT * FROM categorias";

        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        " | Nombre: " + rs.getString("nombre") +
                        " | Descripción: " + rs.getString("descripcion"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarCategoria(int id, String nombre, String descripcion) {
        if (existeCategoria(nombre)) {
            System.out.println("❌ Ya existe una categoría con ese nombre.");
            return;
        }

        String sql = "UPDATE categorias SET nombre = ?, descripcion = ? WHERE id = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.setInt(3, id);

            int filas = stmt.executeUpdate();
            if (filas > 0) {
                System.out.println("✅ Categoría actualizada.");
            } else {
                System.out.println("❌ No se encontró la categoría.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCategoria(int id) {
        String sql = "DELETE FROM categorias WHERE id = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            int filas = stmt.executeUpdate();
            if (filas > 0) {
                System.out.println("✅ Categoría eliminada.");
            } else {
                System.out.println("❌ No se encontró la categoría.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean existeCategoria(String nombre) {
        String sql = "SELECT COUNT(*) FROM categorias WHERE nombre = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            return rs.getInt(1) > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
