//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado(1,"Marcos","Cajero",1000);
        Empleado e2 = new Empleado(2,"Ema","Cajero",2000);
        Empleado e3 = new Empleado("Lady Gaga","Cantante");
        Empleado e4 = new Empleado("Miley","Baterista");

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());

        e1.actualizarSalario(15);
        e2.actualizarSalario(2000.5);
        e3.actualizarSalario(5000.6);
        e4.actualizarSalario(50);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());

        Empleado.mostrarTotalEmpleados();

    }
}