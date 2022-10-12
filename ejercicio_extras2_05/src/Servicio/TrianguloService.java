package Servicio;

import Entidad.Triangulo;
import java.util.Scanner;

//@author Facundo Cruz
public class TrianguloService {

    public Triangulo crearTriangulo() {
        Triangulo t1 = new Triangulo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el lado A");
        t1.setA(leer.nextInt());
        System.out.println("Ingrese el lado B, que será igual al lado C");
        t1.setB(leer.nextInt());
        t1.setC(t1.getB());
        System.out.println("Triángulo isósceles creado con éxito");
        return t1;
    }

    public double traerAltura(Triangulo t1) {
        return Math.sqrt(Math.pow((double) t1.getB(), 2.0) - (t1.getA() / 2));
    }

    public int calcularArea(Triangulo t1) {
        return (t1.getA() * (int) traerAltura(t1)) / 2;
    }

    public int calcularPerimetro(Triangulo t1) {
        return t1.getA() + t1.getB() * 2;
    }
}
