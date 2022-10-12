//Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
//vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
//Crear métodos que permitan:
//● Que un usuario cargue su ficha del auto.
//● Que el usuario, modifique la titularidad del vehículo.
//● Indicar un trayecto recorrido, modificando de este modo los KM del motor
//● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
//al llegar a los 10.000km corresponde realizarlo.

package ejercicio_extras2_07;

//@author Facundo Cruz

import Entidad.Auto;
import Servicio.AutoService;
import java.util.Scanner;


public class Ejercicio_extras2_07 {

    public static void main(String[] args) {
        AutoService sv = new AutoService();
        Auto a1 = sv.cargarFicha();
        sv.andar(a1);
        sv.modificarTitularidad(a1);
        sv.andar(a1);
        System.out.println(a1);
    }

}
