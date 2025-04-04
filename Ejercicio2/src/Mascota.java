public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    void mostrarInfo(){
        System.out.println("Los datos de la mascota son: "+ nombre+ " especie: "+especie+" y su edad es de "+edad);;
    }
    int cumplirAnios(){
        edad += 1;
        return edad;
    }
}
