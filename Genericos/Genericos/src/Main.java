//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Producto<String> prodst = new Producto<>("SKU","Auriculares",300.40);
        Producto<Integer> prod1 = new Producto<>(1, "Camisa", 20.0);
        Producto<Integer> prod2 = new Producto<>(2, "Pantalón", 30.0);
        Producto<Integer> prod3 = new Producto<>(3, "Zapatos", 50.0);

        Pedido pedido1 = new Pedido(101, new ArrayList<>(), LocalDate.of(2025, 6, 1));
        pedido1.agregarProducto(prod1);
        pedido1.agregarProducto(prod2);

        Pedido pedido2 = new Pedido(102, new ArrayList<>(), LocalDate.of(2025, 5, 25));
        pedido2.agregarProducto(prod3);

        Pedido pedido3 = new Pedido(103, new ArrayList<>(), LocalDate.of(2025, 6, 5));
        pedido3.agregarProducto(prod1);
        pedido3.agregarProducto(prod2);
        pedido3.agregarProducto(prod3);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        System.out.println("👉 Orden por TOTAL:");
        Collections.sort(pedidos);  // Usa compareTo
        for (Pedido p : pedidos) {
            System.out.println("Pedido " + p.getId() + " - Total: $" + p.calcularTotal());
        }

        System.out.println("\n👉 Orden por FECHA:");
        pedidos.sort(new ComparadorPedidosPorFecha());  // Usa Comparator
        for (Pedido p : pedidos) {
            System.out.println("Pedido " + p.getId() + " - Fecha: " + p.getFecha());
        }
        Buscador<Pedido, Integer> buscador = new Buscador<>();
        Pedido resultado = buscador.buscar(pedidos, 102);

        if (resultado != null) {
            System.out.println("✅ Pedido encontrado: ID " + resultado.getId() + ", Total: $" + resultado.calcularTotal());
        } else {
            System.out.println("❌ Pedido no encontrado");
        }
    }

}

