package org.example.kata4.dao;

import org.example.kata4.model.ItemPedido;
import org.example.kata4.model.Producto;
import org.example.kata4.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemPedidoDAO {
    public void crearConPedidoId(Connection conn, ItemPedido item, int pedidoId) throws SQLException {
        String sql = "INSERT INTO items_pedido (pedido_id, producto_id, cantidad, subtotal) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pedidoId);
            ps.setInt(2, item.getProducto().getId());
            ps.setInt(3, item.getCantidad());
            ps.setDouble(4, item.getSubtotal());
            ps.executeUpdate();
        }
    }

    public List<ItemPedido> listarPorPedido(int pedidoId) {
        List<ItemPedido> lista = new ArrayList<>();
        String sql = """
            SELECT i.*, p.nombre, p.precio 
            FROM items_pedido i
            JOIN productos p ON i.producto_id = p.id
            WHERE i.pedido_id = ?
        """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pedidoId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto prod = new Producto();
                prod.setId(rs.getInt("producto_id"));
                prod.setNombre(rs.getString("nombre"));
                prod.setPrecio(rs.getDouble("precio"));

                ItemPedido item = new ItemPedido();
                item.setId(rs.getInt("id"));
                item.setCantidad(rs.getInt("cantidad"));
                item.setSubtotal(rs.getDouble("subtotal"));
                item.setProducto(prod);

                lista.add(item);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}

