//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
//e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
package Circunferencia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese el radio de su circunferencia");
        radio = leer.nextFloat();
    }

    public void area() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es " + df.format(area));
    }

    public void perimetro() {
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perímetro es " + df.format(perimetro));
    }
}
