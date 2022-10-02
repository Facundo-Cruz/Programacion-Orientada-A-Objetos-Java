//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
//atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
//jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
//parámetros que sean necesarios:

package ejercicio_extra_06;

//@author Facundo Cruz

import Servicio.AhorcadoService;


public class Ejercicio_extra_06 {

    public static void main(String[] args) {
        AhorcadoService ac = new AhorcadoService();
        ac.juego();
        
    }

}
