
package Servicio;

import Entidad.Persona;
import java.util.Scanner;


//@author Facundo Cruz

public class PersonaService {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        char sexo;
        Persona O1 = new Persona();
        System.out.println("Ingrese un nombre");
        O1.setNombre(leer.next());
        System.out.println("Ingrese una edad");
        O1.setEdad(leer.nextInt());
        System.out.println("Ingres su sexo.(H,M o O)");
        sexo = leer.next().toUpperCase().charAt(0);
        while (sexo!='H'&&sexo!='M'&&sexo!='O') {
            System.out.println("Erorr, valor inválido vuelve a intentarlo.");
            sexo = leer.next().toUpperCase().charAt(0);
        }
        O1.setSexo(sexo);
        System.out.println("Ingrese un peso");
        O1.setPeso(leer.nextInt());
        System.out.println("Ingrese una altura");
        O1.setAltura(leer.nextDouble());
        return O1;
    }
    //• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    public int calcularIMC(Persona O1){
        double IMC = (double)O1.getPeso()/(Math.pow(O1.getAltura(), 2));
        if (IMC<20) {
            return -1;
        }else if (IMC>=20||IMC<=25) {
            return 0;
        }else{
            return 1;
        }
    }
    //• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
//un booleano.
    public boolean esMayorDeEdad(Persona O1){
        return (O1.getEdad()>=18);
    }
}
