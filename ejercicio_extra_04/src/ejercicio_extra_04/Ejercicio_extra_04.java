

package ejercicio_extra_04;

//@author Facundo Cruz

import Entidad.NIF;
import Servicio.NIFservice;


public class Ejercicio_extra_04 {

    public static void main(String[] args) {
        NIFservice ac = new NIFservice();
        NIF o1 = ac.crearNif();
        ac.mostrar(o1);
    }

}
