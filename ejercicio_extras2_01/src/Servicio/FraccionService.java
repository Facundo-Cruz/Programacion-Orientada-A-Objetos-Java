//Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
//fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
//fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

public class FraccionService {

    public Fraccion crearFraccion() {
        Scanner leer = new Scanner(System.in);
        Fraccion f1 = new Fraccion();
        System.out.println("Ingrese el numerador 1");
        f1.setNumerador1(leer.nextInt());
        System.out.println("Ingrese el denominador 1");
        f1.setDenominador1(leer.nextInt());
        System.out.println("Ingrese el numerador 2");
        f1.setNumerador2(leer.nextInt());
        System.out.println("Ingrese el denominador 2");
        f1.setDenominador2(leer.nextInt());
        return f1;
    }

    public void Sumar(Fraccion f1) {
        int denominador = MCM(f1);
        int a = f1.getNumerador1() * (denominador / f1.getDenominador1());
        int b = f1.getNumerador2() * (denominador / f1.getDenominador2());
        int numerador = a + b;
        System.out.print("( " + f1.getNumerador1() + " / " + f1.getDenominador1() + " ) + ( " + f1.getNumerador2() + " / " + f1.getDenominador2() + " ) = ");
        MCD(numerador, denominador);
    }

    public void Restar(Fraccion f1) {
        int denominador = MCM(f1);
        int a = f1.getNumerador1() * (denominador / f1.getDenominador1());
        int b = f1.getNumerador2() * (denominador / f1.getDenominador2());
        int numerador = a - b;
        System.out.print("( " + f1.getNumerador1() + " / " + f1.getDenominador1() + " ) - ( " + f1.getNumerador2() + " / " + f1.getDenominador2() + " ) = ");
        
    }

    public int MCM(Fraccion f1) {
        int max = Math.abs(Math.max(f1.getDenominador1(), f1.getDenominador2()));
        int min = Math.abs(Math.min(f1.getDenominador1(), f1.getDenominador2()));
        int i = max;
        while (!(i % max == 0 && i % min == 0)) {
            i++;
        }
        return i;
    }

    public void MCD(int num, int den) {
        if (num % den == 0) {
            System.out.println(num / den);
        } else {
            int max = Math.abs(Math.max(num, den));
            int min = Math.abs(Math.min(num, den));
            int resultado = 0;
            do {
                resultado = min;
                min = max % min;
                max = resultado;
            } while (min != 0);
            System.out.println(num / resultado + " / " + den / resultado);
        }
    }
}
