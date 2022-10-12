package ejercicio_extras2_03;

import Entidad.Pass;
import Servicio.PassService;
import java.util.Scanner;

public class Ejercicio_extras2_03 {

    public static void main(String[] args) {
        PassService sv = new PassService();
        Scanner leer = new Scanner(System.in);
        Pass c1 = new Pass();
        boolean var = false;
        int opcion;
        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Ingresar contraseña");
            System.out.println("2 - Mostrar nivel contrseña");
            System.out.println("3 - Modificar contraseña");
            System.out.println("4 - Modificar nombre");
            System.out.println("5 - Modificar Dni");
            System.out.println("6 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    if (var) {
                        System.out.println("Ya has ingresado la contraseña.");
                        break;
                    }
                    sv.crearPass(c1);
                    var = true;
                    break;
                case 2:
                    if (!var) {
                        System.out.println("Todavía no has ingresado la contraseña.");
                        break;
                    }
                    sv.analizarPass(c1);
                    break;
                case 3:
                    if (!var) {
                        System.out.println("Todavía no has ingresado la contraseña.");
                        break;
                    }
                    sv.acceso(c1);
                    sv.crearPass(c1);
                    break;
                case 4:
                    if (!var) {
                        System.out.println("Todavía no has ingresado la contraseña.");
                        break;
                    }
                    sv.modificarNombre(c1);
                    break;
                case 5:
                    if (!var) {
                        System.out.println("Todavía no has ingresado la contraseña.");
                        break;
                    }
                    sv.modificarDni(c1);
                    break;
                case 6:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 6));
    }

}
