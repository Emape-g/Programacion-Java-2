//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro l = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        l.mostrarInfo();
        l.setAnioPublicacion(1800);
        l.setAnioPublicacion(2030);
        l.setAnioPublicacion(2000);
        l.mostrarInfo();
    }
}