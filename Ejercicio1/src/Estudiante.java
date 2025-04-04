public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    void mostrarInfo() {
        System.out.println("Estudiante "+apellido +" "+ nombre +" "+ curso +" "+"Calificacion"+ " "+calificacion);
    }

    void subirCalificacion(double puntos) {
        if (calificacion + puntos > 10) {
            System.out.println("No se puede aumentar esa cantidad de puntos");
        } else {
            calificacion += puntos;
            System.out.println("La calificion subio a "+calificacion);
        }

    }

    void bajarCalificacion(double puntos) {
        if (calificacion - puntos < 0) {
            System.out.println("No se puede bajar esa cantidad de puntos");
        } else {
            calificacion -= puntos;
            System.out.println("La calificion bajo a " + calificacion);
        }
    }
}