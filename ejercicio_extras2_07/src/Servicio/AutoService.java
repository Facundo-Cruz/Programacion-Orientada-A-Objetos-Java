//Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
//vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
//Crear métodos que permitan:
//● Que un usuario cargue su ficha del auto.
//● Que el usuario, modifique la titularidad del vehículo.
//● Indicar un trayecto recorrido, modificando de este modo los KM del motor
//● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
//al llegar a los 10.000km corresponde realizarlo.
package Servicio;

import Entidad.Auto;
import java.util.Scanner;

//@author Facundo Cruz
public class AutoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Auto cargarFicha() {
        Auto a1 = new Auto();
        System.out.println("Ingrese el titular del auto");
        a1.setNameOwner(leer.next());
        System.out.println("Ingrese el color del vehículo");
        a1.setColor(leer.next());
        System.out.println("Ingrese la fecha de vencimiento(Año, mes, día)");
        a1.setFechaVencimiento(leer.nextInt(), leer.nextInt(), leer.nextInt());
        return a1;
    }

    public void modificarTitularidad(Auto a1) {
        System.out.println("Ingrese el nuevo titular");
        a1.setNameOwner(leer.next());
    }

    public void andar(Auto a1) {
        System.out.println("Ingrese la cantidad de km a recorrer");
        a1.setKm(a1.getKm() + leer.nextInt());
        realizarService(a1.getKm());
    }

    public void realizarService(int km){
        if (km>=10000) {
            System.out.println("Has superado los 10000km, es recomendable que realize un service.");
        }
    }
}
