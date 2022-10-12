package Servicio;

import Entidad.Fecha;
import java.util.Scanner;

public class FechaService {

    public void verificarYear(Fecha f1, int year) {
        if (year < 1900 || year > 2021) {
            System.out.println("Año fuera de los parámetros. Se ha cargado 1900 por defecto.");
            f1.setYear(1900);
        }
    }

    public boolean esBisiesto(Fecha f1) {
        if (f1.getYear() % 4 == 0 && f1.getYear() % 100 != 0) {
            return true;
        } else {
            return f1.getYear() % 4 == 0 && f1.getYear() % 100 == 0 && f1.getYear() % 400 == 0;
        }
    }

    public int verificadorDato(String datoNombre, int datoValor, int max, int min) {
        Scanner leer = new Scanner(System.in);
        while (datoValor < min || datoValor > max) {
            System.out.println("Error, ingrese un " + datoNombre + " válido.");
            datoValor = leer.nextInt();
        }
        return datoValor;
    }

    public void mostrarDiasMaximos(int fechaMes[], String nombreMes[], Fecha f1) {
        System.out.println("USTED INGRESO MES " + (f1.getMonth() + 1) + "(" + (nombreMes[f1.getMonth()]) + "), QUE TIENE " + fechaMes[f1.getMonth()] + " DÍAS.");
    }

    public void mostrarFechaAnterior(int[] days, String[] months, Fecha f1) {
        System.out.println("Fecha anterior:");
        if (f1.getDay() == 1 && f1.getMonth() != 0) {
            System.out.print(days[f1.getMonth() - 1] + " de " + months[f1.getMonth() - 1] + " de " + f1.getYear());
        } else if (f1.getMonth() != 0) {
            System.out.print(f1.getDay() - 1 + " de " + months[f1.getMonth()] + " de " + f1.getYear());
        } else {
            System.out.print(days[11] + " de " + months[11] + " de " + (f1.getYear() - 1));
        }
        System.out.println("");
    }

    public void mostrarFechaPosterior(int[] days, String[] months, Fecha f1) {
        System.out.println("Fecha posterior:");
        if (f1.getDay() == days[f1.getMonth()] && f1.getMonth() != 11) {
            System.out.print("1 de " + months[f1.getMonth() + 1] + " de " + f1.getYear());
        } else if (f1.getMonth() != 11) {
            System.out.print(f1.getDay() + 1 + " de " + months[f1.getMonth()] + " de " + f1.getYear());
        } else {
            System.out.print("1 de " + months[0] + " de " + (f1.getYear() + 1));
        }
        System.out.println("");
    }

}
