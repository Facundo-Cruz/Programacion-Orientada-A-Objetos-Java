//Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. Deberá además implementar los siguientes métodos:


package ejercicio_09;

//@author Facundo Cruz

import Entidad.Matemática;
import Servicio.MatemáticaService;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Ejercicio_09 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.###");
        Scanner leer = new Scanner(System.in);
        MatemáticaService accion = new MatemáticaService();
        Matemática op = new Matemática();
        op.setNumero1(Math.random()*10);
        op.setNumero2(Math.random()*10);
        System.out.println("Número 1: "+df.format(op.getNumero1())+"\nNúmero 2: "+df.format(op.getNumero2()));
        System.out.println("El número mayor es: "+df.format(accion.devolverMayor(op)));
        System.out.println("La potencia del mayor eleveado al menor es: "+df.format(accion.calcularPotencia(op)));
        System.out.println("La raíz cudrada del menor es: "+df.format(accion.calcularRaiz(op)));
    }

}
