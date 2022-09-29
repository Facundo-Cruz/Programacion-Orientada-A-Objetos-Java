//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.

package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;


//@author Facundo Cruz

public class PersonaService {
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        System.out.println("Ingrese un nombre:");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese una fecha de nacimiento(año/mes/día)");
        p1.setFechaN(new Date(leer.nextInt()-1900,leer.nextInt()-1, leer.nextInt()));
        return p1;
    }
    
    public int calcularEdad(Persona p1){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear()-p1.getFechaN().getYear();
        if (p1.getFechaN().getMonth()>fechaActual.getMonth()) {
            edad--;
        }else if(p1.getFechaN().getMonth()==fechaActual.getMonth()&&p1.getFechaN().getDate()>fechaActual.getDate()){
            edad--;
        }
        return edad;
    }
    
    public boolean menorQue(int edadU, Persona p1){
        return (calcularEdad(p1)<edadU);
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println("Nombre:"+p1.getNombre());
        System.out.println("Fecha de Nacimiento:"+p1.getFechaN().toString());
    }
}
