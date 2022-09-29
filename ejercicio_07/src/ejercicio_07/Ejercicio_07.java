
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
//sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
//mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.

package ejercicio_07;

//@author Facundo Cruz

import Entidad.Persona;
import Servicio.PersonaService;


public class Ejercicio_07 {

    public static void main(String[] args) {
        PersonaService accion = new PersonaService();
        Persona Objetos[] = new Persona[4];
        int mayorEdad = 0, PesoB = 0, PesoI = 0, PesoP = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Persona "+(i+1));
            Objetos[i] = accion.crearPersona();
            switch (accion.calcularIMC(Objetos[i])) {
                case -1:
                    PesoB++;
                    break;
                case 0:
                    PesoI++;
                    break;
                case 1:
                    PesoP++;
                    break;
            }
            if (accion.esMayorDeEdad(Objetos[i])) {
                mayorEdad++;
            }
        }
        //Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
        System.out.println("El porcentaje de peso bajo es: "+(PesoB*100/4)+"%");
        System.out.println("El porcentaje de peso ideal es: "+(PesoI*100/4)+"%");
        System.out.println("El porcentaje de sobrepeso es: "+(PesoP*100/4)+"%");
        System.out.println("El porcantaje de mayores de edad es "+(mayorEdad*100/4)+"%");
        System.out.println("El porcentaje de menores de edad es "+(100-(mayorEdad*100/4))+"%");
    }

}
