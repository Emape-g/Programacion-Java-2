public class Cliente implements Notificable{
   private String nombre;
   private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    public Cliente(){

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviando notificación a " + nombre + " (" + email + "): " + mensaje);
    }
}
