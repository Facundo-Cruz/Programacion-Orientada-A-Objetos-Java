
import Entidad.Sopa;
import Servicio.SopaService;
import java.util.Scanner;


//@author Facundo Cruz

public class Main {

    public static void main(String[] args) {
        SopaService sv = new SopaService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Sopa s1 = new Sopa();
        int opcion;
        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Imprimir matriz");
            System.out.println("2 - Imprimir matriz invertida");
            System.out.println("3 - Buscar palabra en la matriz");
            System.out.println("4 - Reemplazar palabra en la matriz");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    sv.imprimirMatriz(s1.getMatriz(), true);
                    break;
                case 2:
                    sv.imprimirMatriz(s1.getMatriz(), false);
                    break;
                case 3:
                    System.out.println("Ingrese una palabra a encontrar en la matriz");
                    s1.setPalabraEncontrar(leer.next());
                    int aux [] = sv.buscarPalabra(s1.getMatriz(), s1.getPalabraEncontrar());
                    if (aux==null) {
                        
                        System.out.println("Palabra no encontrada");
                    }else{
                        System.out.println("Palabra encontrada en ["+aux[0]+"],["+aux[1]+"]");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese una palabra a encontrar en la matriz");
                    s1.setPalabraEncontrar(leer.next());
                    System.out.println("Ingrese una palabra para reemplazarla");
                    sv.reemplazarDatos(s1.getPalabraEncontrar(), leer.next(), s1.getMatriz());
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));
    }

}
