//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante E = new Estudiante("Emanuel","Perez","prg3",5);
        E.mostrarInfo();
        E.subirCalificacion(2);
        E.bajarCalificacion(2);
        }
    }
