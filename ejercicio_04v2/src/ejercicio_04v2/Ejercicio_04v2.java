//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
//los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
//superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
//altura. Se deberán además definir los métodos getters, setters y constructores
//correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

package ejercicio_04v2;

//@author Facundo Cruz

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;


public class Ejercicio_04v2 {

    public static void main(String[] args) {
        ServicioRectangulo accion = new ServicioRectangulo();
        Rectangulo O1 = accion.crearRectángulo();
        System.out.println(accion.calcularSuperficie(O1));  
        System.out.println(accion.calcularPerimetro(O1));
        accion.dibujarRectangulo(O1);
    }

}
