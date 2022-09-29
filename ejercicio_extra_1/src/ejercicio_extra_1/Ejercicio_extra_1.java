//Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
//además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
//otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
//definir los métodos getters y setters correspondientes.

package ejercicio_extra_1;

//@author Facundo Cruz

import Entidad.Cancion;
import Servicio.CancionService;


public class Ejercicio_extra_1 {

    public static void main(String[] args) {
        CancionService ac = new CancionService();
        Cancion c1 = ac.crearCancion();
        System.out.println(c1);
    }

}
