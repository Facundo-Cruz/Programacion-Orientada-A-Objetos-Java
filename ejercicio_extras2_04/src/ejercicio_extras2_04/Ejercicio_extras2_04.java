package ejercicio_extras2_04;

import Entidad.Fecha;
import Servicio.FechaService;
import java.util.Scanner;

public class Ejercicio_extras2_04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        FechaService sv = new FechaService();
        Fecha f1 = new Fecha();
        int fechaMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String nombreMes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println("Ingrese un año");
        f1.setYear(leer.nextInt());
        sv.verificarYear(f1, f1.getYear());
        if (sv.esBisiesto(f1)) {
            fechaMes[1] = 29;
            System.out.println("El año ingresado es bisiesto");
        } else {
            System.out.println("El año ingresado no es bisiesto");
        }
        System.out.println("Ingrese un mes");
        f1.setMonth(sv.verificadorDato("mes", leer.nextInt(), 12, 1) - 1); //sv.verificadorDato("Nombre dato", lectura del usuario, max, min) - 1)
        sv.mostrarDiasMaximos(fechaMes, nombreMes, f1);
        System.out.println("Ingrese un dia");
        f1.setDay(sv.verificadorDato("dia", leer.nextInt(), fechaMes[f1.getMonth()], 1));
        sv.mostrarFechaAnterior(fechaMes, nombreMes, f1);
        System.out.println("Fecha actual:");
        System.out.println(f1.getDay() + " de " + nombreMes[f1.getMonth()] + " de " + f1.getYear());
        sv.mostrarFechaPosterior(fechaMes, nombreMes, f1);
    }

}
