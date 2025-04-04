public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        int anioActual = java.time.Year.now().getValue();
        if (nuevoAnio < 1900 || nuevoAnio > anioActual) {
            System.out.println("No puede ser modificado por ese año");
        } else {
            this.anioPublicacion = nuevoAnio;
        }
    }


    public Libro(String titulo, String autor, int aniooPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = aniooPublicacion;
    }
    void mostrarInfo(){
        System.out.println("Los datos del libro son: "+titulo+" "+autor+" año de publicacion "+anioPublicacion);
    }
}
