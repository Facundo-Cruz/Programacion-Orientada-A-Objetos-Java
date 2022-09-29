//Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
//además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
//otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
//definir los métodos getters y setters correspondientes.

package Servicio;

import Entidad.Cancion;
import java.util.Scanner;


//@author Facundo Cruz

public class CancionService {
    public Cancion crearCancion(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Cancion c1 = new Cancion();
        System.out.println("Ingrese el nombre de la canción.");
        c1.setTitulo(sc.next());
        System.out.println("Ingrese el autor");
        c1.setAutor(sc.next());
        return c1;
        
    }
}
