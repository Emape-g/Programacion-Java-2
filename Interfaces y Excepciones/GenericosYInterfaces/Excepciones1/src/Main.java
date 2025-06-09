import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingrese el primer numero entero: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = sc.nextInt();
            int resultado = num1/num2;
            System.out.println("El resultado de la división es "+resultado);

        }catch (ArithmeticException e){
            System.out.println("ERROR: no se puede divir por cero");
            System.out.println("Fue un error " + e.getMessage());
        }
        System.out.println("Programa finalizado");

        try{
            System.out.println("Ingrese un numero entero");
            String a = sc.nextLine();
            int numero = Integer.parseInt(a);
            System.out.println("Su numero ingresado es "+ numero);
        }catch (NumberFormatException e){
            System.out.println("NO ES UN VALOR NUMERICO");
            System.out.println("Detalle "+ e.getMessage());
        }

        System.out.print("Ingrese el nombre del archivo (con extensión): ");

        String nombreArchivo = sc.nextLine();

        File archivo = new File(nombreArchivo);

        try {
            Scanner lector = new Scanner(archivo);
            System.out.println("Contenido del archivo:\n");

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ Error: El archivo \"" + nombreArchivo + "\" no fue encontrado.");
        }
        System.out.print("Ingrese su edad: ");

        int edad = sc.nextInt();

        try {
            Main(edad);
            System.out.println("Edad válida: " + edad + " años.");
        } catch (EdadInvalidaException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
        System.out.print("Ingrese el nombre del archivo (con extensión): ");
        String nombreArchivo2 = sc.nextLine();

        // try-with-resources: se cierra automáticamente al salir del bloque
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo2))) {
            String linea;
            System.out.println("\nContenido del archivo:\n");

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("⚠️ Error al leer el archivo: " + e.getMessage());
        }
    }



}


        public static void Main(int edad) throws EdadInvalidaException {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
            }
        }



        void main() {
        }

