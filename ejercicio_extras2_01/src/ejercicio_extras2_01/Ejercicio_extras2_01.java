//Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
//fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
//fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
package ejercicio_extras2_01;

//@author Facundo Cruz
import Entidad.Fraccion;
import Servicio.FraccionService;
import java.util.Scanner;

public class Ejercicio_extras2_01 {

    public static void main(String[] args) {
        FraccionService sv = new FraccionService();
        Fraccion f1 = sv.crearFraccion();
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sv.Sumar(f1);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (opcion != 5);

    }

}
