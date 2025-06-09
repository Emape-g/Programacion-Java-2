import java.util.ArrayList;
import java.util.List;

public class Carrito <T extends  Producto>{
    private List<T> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }
    public void agregarProducto(T producto){
        productos.add(producto);
    }
    public void eliminarProducto(T producto){
        productos.remove(producto);
    }

    public List<T> getProductos() {
        return productos;
    }

    public double obtenerTotal(){
        double total = 0.0;
        for(T p:productos){
            if (p instanceof Producto<?>) {
                total += ((Producto<?>) p).getPrecio();
            }
        }
        return total;
    }

    public void setProductos(List<T> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "productos=" + productos +
                '}';
    }
}
