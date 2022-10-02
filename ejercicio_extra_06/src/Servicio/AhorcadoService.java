//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
//la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
//valor que ingresó el usuario y encontradas en 0.
//• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
//• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
//• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
//• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
//• Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.

package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;


//@author Facundo Cruz

public class AhorcadoService {

    Scanner leer = new Scanner(System.in);
    public Ahorcado crearJuego(){
        Ahorcado o1 = new Ahorcado();
        System.out.println("Ingrese una palabra");
        String palabra = leer.next();
        String vector[] = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = String.valueOf(palabra.charAt(i));
        }
        o1.setPalabra(vector);
        System.out.println("Ingrese la cantidad de jugadas máxima");
        o1.setCantM(leer.nextInt());
        return o1;
    }

    public void longitud(Ahorcado o1){
        System.out.println("La longitud de la palabra es: "+o1.getPalabra().length);
    }
    //• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public void buscar(Ahorcado o1, String letra){
        boolean var = false;
        for (String i: o1.getPalabra()) {
            if (i.equals(letra)) {
                var = true; 
                break;
            }
        }
        if (var) {
            System.out.println("La letra pertenece a la palabra");
            o1.setCantE(o1.getCantE()+1);
        }else{
            System.out.println("La letra no pertenece a la palabra");
            o1.setCantM(o1.getCantM()-1);
        }
    }

    public void mostrarStats(Ahorcado o1){
        System.out.println("Número de letras (encontradas, faltantes): ("+o1.getCantE()+","+(o1.getPalabra().length-o1.getCantE())+")");
    }
    
    public void intentos(Ahorcado o1){
        if (o1.getCantM()!=0) {
            System.out.println("Número de oportunidades restantes: "+o1.getCantM());
        }else{
            System.out.println("Lo sentimos, no hay más oportunidades.");
        }
    }

    public void juego(){
        Ahorcado o1 = crearJuego();
        String letra;
        do {
            System.out.println("Ingrese una letra");
            letra = leer.next();
            longitud(o1);
            buscar(o1, letra);
            mostrarStats(o1);
            intentos(o1);
            System.out.println("----------------------------------------");
        } while (o1.getCantM()!=0&&o1.getCantE()!=o1.getPalabra().length);
        if (o1.getCantM()!=0) {
            System.out.println("¡Felicidades, completaste la palabra!");
        }
    }
}
