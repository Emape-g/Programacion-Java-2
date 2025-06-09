//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Auriculares", 2500.0);
        Producto p2 = new Producto("Mouse", 1500.0);

        Pedido pedido = new Pedido();
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("Total del pedido: $" + pedido.calcularTotal());
    }
}