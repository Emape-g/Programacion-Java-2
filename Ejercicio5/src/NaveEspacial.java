public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    void mostrarEstado(){
        System.out.println("Nombre de la nave"+ nombre+ " combustible actual "+ combustible);
    }
    int despegar() {
        if (combustible < 10) {
            System.out.println("No puede despegar");
        } else {
            combustible -= 10;

        }
        return combustible;
    }
    int avanzar(int disntacia){
        if (disntacia > combustible){
            System.out.println("No es posible realizar esa distancia por falta de combusitble!");
        }else{
            combustible -= disntacia;
        }
        return combustible;
    }
    int recargarCombustible(int cantidad){
        if (combustible>100){
            System.out.println("Estas excediendo el limite de combustible");
        }
        else{
            combustible += cantidad;
        }
        return combustible;
    }

}
