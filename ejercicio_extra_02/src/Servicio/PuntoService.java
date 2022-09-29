/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Punto;
import java.text.DecimalFormat;
import java.util.Scanner;

//@author Facundo Cruz
public class PuntoService {

    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.##");

    public Punto crearPunto(int i) {
        System.out.println("ingrese la x del punto " + i);
        double x = sc.nextDouble();
        System.out.println("ingrese la y del punto " + i);
        double y = sc.nextDouble();
        return new Punto(x, y);
    }

    public void CalcDistancia(Punto p1, Punto p2) {
        double difx = p1.getX() - p2.getX();
        double dify = p1.getY() - p2.getY();
        System.out.println("la distancia que existe entre los dos puntos es de " + df.format(Math.sqrt(Math.pow(difx, 2) + Math.pow(dify, 2))));
    }
}
