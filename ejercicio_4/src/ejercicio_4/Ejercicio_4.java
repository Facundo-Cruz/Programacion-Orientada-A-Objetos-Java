//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
//los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
//superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
//altura. Se deberán además definir los métodos getters, setters y constructores
//correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

package ejercicio_4;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la base.");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura");
        int altura = leer.nextInt();
        Rectangulo obt1 = new Rectangulo(base, altura);
        System.out.println("La superficie del rectángulo es: "+obt1.calcularSuperficie());
        System.out.println("El perimetro del rectángulo es: "+obt1.calcularPerimetro());
        obt1.imprimirRectangulo();
    }

}
