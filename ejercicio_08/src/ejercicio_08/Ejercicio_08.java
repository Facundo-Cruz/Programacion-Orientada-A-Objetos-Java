//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
//y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
//que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
//través de los métodos set, se guardará la frase y la longitud de manera automática según
//la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:


package ejercicio_08;

//@author Facundo Cruz

import Entidad.Cadena;
import Servicio.CadenaService;
import java.util.Scanner;


public class Ejercicio_08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaService accion = new CadenaService();
        Cadena fraseU = new Cadena();
        fraseU.setFrase(leer.next());
        fraseU.setLongitud(fraseU.getFrase().length());
        accion.mostrarVocales(fraseU);
        accion.invertirFrase(fraseU);
        System.out.println("Ingrese una letra para contabilizarla en la frase");
        accion.vecesRepetido(leer.next(), fraseU);
        System.out.println("Ingrese una frase nueva");
        accion.compararLongitud(leer.next(), fraseU);
        System.out.println("Ingrese otra frase para unirla con la frase inicial");
        accion.unirFrase(leer.next(), fraseU);
        System.out.println("Ingrese un carácter para reemplazar por la letra 'a' en la frase inicial");
        accion.reemplazar(leer.next(), fraseU);
        System.out.println("Ingrese una letra para verificar si se encuentra en la frase inicial");
        accion.contiene(leer.next(), fraseU);
    }

}
