//Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
//(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
//métodos:


package ejercicio_12;

//@author Facundo Cruz

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;


public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService accion = new PersonaService();
        Persona p1 = accion.crearPersona();
        System.out.println("La edad es: "+accion.calcularEdad(p1));
        System.out.println("Ingrese una edad para comparar");
        if (accion.menorQue(leer.nextInt(), p1)) {
            System.out.println("La segunda edad es mayor.");
        }else{
            System.out.println("La primer edad es mayor.");
        }
        accion.mostrarPersona(p1);
    }

}
