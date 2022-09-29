//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
//los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
//superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
//altura. Se deberán además definir los métodos getters, setters y constructores
//correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;


//@author Facundo Cruz

public class ServicioRectangulo {

    public ServicioRectangulo() {
    }
    
    public Rectangulo crearRectángulo(){
        Scanner leer = new Scanner(System.in);
        Rectangulo O1 = new Rectangulo();
        System.out.println("Ingrese una altura");
        O1.setAltura(leer.nextInt());
        System.out.println("Ingrese la base");
        O1.setBase(leer.nextInt());
        return O1;
    }
    public String calcularSuperficie(Rectangulo O1){
        return "La superficie es: "+(O1.getAltura()*O1.getBase());
        // return  altura * base;
    }
    public String calcularPerimetro(Rectangulo O1){
        return "El perímetro es: "+(O1.getAltura()+O1.getBase())*2;
        // return  (altura + base) * 2;
    }
    public void dibujarRectangulo(Rectangulo O1){
        System.out.println("Dibujo: ");
        for (int i = 0; i < O1.getAltura(); i++) {
            for (int j = 0; j < O1.getBase(); j++) {
                if (i > 0 && i < O1.getAltura()-1 && j > 0 && j < O1.getBase()-1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }

            }
            System.out.println("");
        }

    }
}
