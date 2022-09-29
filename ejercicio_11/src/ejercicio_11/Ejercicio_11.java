//Clase Date
//
//11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
//puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
package ejercicio_11;

//@author Facundo Cruz
import java.util.Date;
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Pedimos fecha al usuario
        System.out.println("Ingrese un año");
        int anio = leer.nextInt() - 1900;
        System.out.println("Ingrese un mes");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese un día");
        int dia = leer.nextInt();

        //Instanciamos la fechas y mostramos
        Date fechaUsuario = new Date(anio, mes, dia);
        System.out.println(fechaUsuario.toString());
        Date fechaActual = new Date();
        System.out.println(fechaActual.toString());
        System.out.println(fechaActual.getMonth());
        System.out.println(fechaUsuario.getMonth());
        //Diferencia
        System.out.println("Hay " + diferencia(fechaUsuario, fechaActual) + " año/s de diferencia entre las dos fechas.");
    }

    public static int diferencia(Date fechaUsuario, Date fechaActual) {
        int dif = Math.abs(fechaUsuario.getYear() - fechaActual.getYear());
        switch (fechaUsuario.compareTo(fechaActual)) {
            case -1:
                if (fechaUsuario.getMonth() > fechaActual.getMonth()) {
                    dif--;
                } else if (fechaUsuario.getMonth() == fechaActual.getMonth() && fechaUsuario.getDate() > fechaActual.getDate()) {
                    dif--;
                }
                break;
            case 1:
                if (fechaUsuario.getMonth() < fechaActual.getMonth()) {
                    dif--;
                } else if (fechaUsuario.getMonth() == fechaActual.getMonth() && fechaUsuario.getDate() < fechaActual.getDate()) {
                    dif--;
                }
                break;
        }
        return dif;
    }

}
