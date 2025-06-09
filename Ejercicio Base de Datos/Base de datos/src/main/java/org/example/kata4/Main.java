package org.example.kata4;

import org.example.kata4.model.ItemPedido;
import org.example.kata4.model.Pedido;
import org.example.kata4.model.Producto;
import org.example.kata4.service.PedidoService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PedidoService pedidoService = new PedidoService();


        Producto prod1 = new Producto();
        prod1.setId(1);

        Producto prod2 = new Producto();
        prod2.setId(2);
        ItemPedido item1 = new ItemPedido();
        item1.setProducto(prod1);
        item1.setCantidad(2);

        ItemPedido item2 = new ItemPedido();
        item2.setProducto(prod2);
        item2.setCantidad(1);


        Pedido pedido = new Pedido();
        List<ItemPedido> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        pedido.setItems(items);


        pedidoService.crearPedido(pedido);


        int ultimoId = pedido.getId();
        pedidoService.mostrarDetallePedido(ultimoId);
    }
}
