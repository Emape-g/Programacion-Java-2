package org.example.kata4.service;
import org.example.kata4.Conexion;
import org.example.kata4.dao.*;
import org.example.kata4.model.*;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;
public class PedidoService {
    private final ProductoDAO productoDAO = new ProductoDAO();
    private final PedidoDAO pedidoDAO = new PedidoDAO();
    private final ItemPedidoDAO itemPedidoDAO = new ItemPedidoDAO();

    public void crearPedido(Pedido pedido) {
        if (pedido.getItems() == null || pedido.getItems().isEmpty()) {
            System.out.println("El pedido debe tener al menos un ítem.");
            return;
        }

        try (Connection conn = Conexion.getConnection()) {
            conn.setAutoCommit(false);

            double total = 0;

            for (ItemPedido item : pedido.getItems()) {
                if (item.getCantidad() <= 0) {
                    System.out.println("Cantidad inválida para el producto: " + item.getProducto().getNombre());
                    conn.rollback();
                    return;
                }

                Producto prodDB = productoDAO.leer(item.getProducto().getId());

                if (prodDB == null) {
                    System.out.println("Producto no encontrado: ID " + item.getProducto().getId());
                    conn.rollback();
                    return;
                }

                if (prodDB.getCantidad() < item.getCantidad()) {
                    System.out.println("Stock insuficiente para: " + prodDB.getNombre());
                    conn.rollback();
                    return;
                }

                double subtotal = item.getCantidad() * prodDB.getPrecio();
                item.setSubtotal(subtotal);
                item.setProducto(prodDB);
                total += subtotal;


                prodDB.setCantidad(prodDB.getCantidad() - item.getCantidad());
                productoDAO.actualizar(prodDB);
            }

            pedido.setFecha(LocalDate.now());
            pedido.setTotal(total);
            int pedidoId = pedidoDAO.crearYDevolverId(conn, pedido);

            for (ItemPedido item : pedido.getItems()) {
                itemPedidoDAO.crearConPedidoId(conn, item, pedidoId);
            }

            conn.commit();
            System.out.println("✅ Pedido creado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void mostrarDetallePedido(int pedidoId) {
        Pedido pedido = pedidoDAO.leer(pedidoId);
        if (pedido == null) {
            System.out.println("Pedido no encontrado.");
            return;
        }

        List<ItemPedido> items = itemPedidoDAO.listarPorPedido(pedidoId);
        double total = 0;
        System.out.println("🧾 Pedido #" + pedidoId + " - Fecha: " + pedido.getFecha());

        for (ItemPedido item : items) {
            Producto p = item.getProducto();
            String categoria = (p.getCategoria() != null) ? p.getCategoria().getNombre() : "Sin categoría";
            System.out.println("Producto: " + p.getNombre() + " | Categoría: " + categoria +
                    " | Cantidad: " + item.getCantidad() + " | Subtotal: $" + item.getSubtotal());
            total += item.getSubtotal();
        }

        System.out.println("💰 Total del pedido: $" + total);
    }

}
