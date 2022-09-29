

package ejercicio_06;

//@author Facundo Cruz

import Entidad.Cafetera;
import Servicio.CafeteraService;
import java.util.Scanner;


public class Ejercicio_06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraService accion = new CafeteraService();
        Cafetera O1 = accion.crearCafetera();
        int opc;
        do {    
            System.out.println("\t.:Menú:.\n1.Llenar cafetera\n2.Servir taza.\n"
                    + "3.Vaciar cafetera\n4.Agregar café.\n5.Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    accion.llenarCafetera(O1);
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de tu taza en ml.");
                    accion.servirTaza(leer.nextInt(), O1);
                    break;
                case 3:
                    accion.vaciarCafetera(O1);
                    break;
                case 4:
                    System.out.println("¿Cuánto café quieres agregar?");
                    accion.agregarCafe(leer.nextInt(), O1);
                    break;
                default:
                    if (opc==5) {
                        System.out.println("Finalizando....");
                    }else{
                        System.out.println("Ingrese una opción valida.");
                    }
            }
        } while (opc!=5);
        
    }

}
