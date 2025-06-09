import java.time.LocalDate;
import java.util.List;

public class Pedido  implements Comparable<Pedido> ,Identificable<Integer>{
    private int id;
    private List<Producto<?>> productos;
    private LocalDate fecha;

    public Pedido(int id, List<Producto<?>> productos, LocalDate fecha) {
        this.id = id;
        this.productos = productos;
        this.fecha = fecha;
    }

    public Pedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Producto<?>> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto<?>> productos) {
        this.productos = productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void agregarProducto(Producto<?> producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto<?> p : productos) {
            total += p.getPrecio();
        }
        return total;
    }


    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.calcularTotal(), otro.calcularTotal());
    };


    @Override
    public Integer getid() {
        return this.id;
    }

    @Override
    public Integer getID() {
        return this.id;
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return Integer.valueOf(this.id).equals(id);
    }

}

