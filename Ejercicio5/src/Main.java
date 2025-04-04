//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NaveEspacial Nav= new NaveEspacial("NAVE",50);
        Nav.avanzar(60);
        Nav.recargarCombustible(40);
        Nav.avanzar(60);
        Nav.mostrarEstado();
        }

}