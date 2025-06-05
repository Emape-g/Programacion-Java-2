import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto>  productos = new ArrayList<>();

    public Pedido() {
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "productos=" + productos +
                '}';
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for(Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
}
