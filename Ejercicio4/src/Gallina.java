public class Gallina {
    private static int contador = 1;
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Gallina.contador = contador;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public Gallina( int edad, int huevosPuestos) {
        this.idGallina = contador;
        contador++;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    int ponerHuevo(){
        huevosPuestos +=1;
        return huevosPuestos;
    }
    int envejecer(){
        edad +=1;
        return edad;
    }
    void mostarEstado(){
        System.out.println("La informacion actual de la gallina es:"+idGallina+" edad "+edad+" huevos puestos "+ huevosPuestos );
    }
}
