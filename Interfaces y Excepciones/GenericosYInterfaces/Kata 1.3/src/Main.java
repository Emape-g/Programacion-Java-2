//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Eman","emape@gmail.com");
        Pedido p1 = new Pedido(c1,"Ocupado");
        p1.cambiarEstado("Pagado");
    }
}