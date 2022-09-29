//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
//actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
//• Constructor predeterminado o vacío
//• Constructor con la capacidad máxima y la cantidad actual
//• Métodos getters y setters.
//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.

package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;


//@author Facundo Cruz

public class CafeteraService {
    public Cafetera crearCafetera(){
        Scanner leer = new Scanner(System.in);
        Cafetera O1 = new Cafetera();
        System.out.println("Ingrese la capacidad de tu cafetera.");
        O1.setCapacidadMaxima(leer.nextInt());
        
        return O1;
    }
    public void llenarCafetera(Cafetera O1){
        O1.setCapacidadActual(O1.getCapacidadMaxima());
        System.out.println("¡Hemos llenado tu cafetera!");
    }
    public void servirTaza(int taza, Cafetera O1){
        if (O1.getCapacidadActual()-taza<0&&O1.getCapacidadActual()!=0) {
            System.out.println("Lo sentimos, no pudimos llenar tu taza solo te servimos "+O1.getCapacidadActual()+"ml.");
            O1.setCapacidadActual(0);
        }else if (O1.getCapacidadActual()-taza>=0) {
            System.out.println("Hemos llenado tu café.");
            O1.setCapacidadActual(O1.getCapacidadActual()-taza);
        }else{
            System.out.println("Lo sentimos no nos queda café.");
        }
    }
    public void vaciarCafetera(Cafetera O1){
        O1.setCapacidadActual(0);
        System.out.println("¡Hemos vaciado tu cafetera.!");
    }
    public void agregarCafe(int cant ,Cafetera O1){
        if (O1.getCapacidadActual()+cant<=O1.getCapacidadMaxima()) {
            O1.setCapacidadActual(O1.getCapacidadActual()+cant);
            System.out.println("Hemos agregado el café");
        }else{
            System.out.println("Estas sobrepasando la cantidad máxima solo pudimos agregar "+(O1.getCapacidadMaxima()-O1.getCapacidadActual())+"ml de tu café.");
            O1.setCapacidadActual(O1.getCapacidadMaxima());
        }
    }
}
