import static java.lang.System.out;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    private static int idContador=1000;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    public Empleado(String nombre,String puesto){
        this.id += idContador++;
        totalEmpleados++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario=30000.0;
    }
    public double actualizarSalario(double cantidad){
           this.salario = this.salario +cantidad;
           return salario;
            }
    public double actualizarSalario(int porcentaje){
        this.salario = this.salario + (this.salario*porcentaje/100);
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
    public static void mostrarTotalEmpleados(){
        System.out.println("El total de empleados es de "+totalEmpleados);
    }
}
