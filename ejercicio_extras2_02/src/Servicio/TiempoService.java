//Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
//constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
//además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
//Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
//animas a simular el paso del tiempo en consola??????


package Servicio;

import Entidad.Tiempo;
import java.util.Scanner;


//@author Facundo Cruz

public class TiempoService {
    public Tiempo ingresarHora(){
        Tiempo t1 = new Tiempo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una hora");
        t1.setHoras(leer.nextInt());
        while (t1.getHoras()>24||t1.getHoras()<0) {
            System.out.println("Ingrese una hora válida.");
            t1.setHoras(leer.nextInt());
        }
        if (t1.getHoras()==24) {
            System.out.println("Has ingresado la hora máxima. Minutos y segundos serán inicializados en 0.");
            t1.setMinutos(0);
            t1.setSegundos(0);
        }else{
            System.out.println("Ingrese los minutos");
        t1.setMinutos(leer.nextInt());
        while (t1.getMinutos()>59||t1.getMinutos()<0) {
            System.out.println("Ingrese minutos validos.");
            t1.setMinutos(leer.nextInt());
        }
        
        System.out.println("Ingrese los segundos");
        t1.setSegundos(leer.nextInt());
        while (t1.getSegundos()<0||t1.getSegundos()>59) {
            System.out.println("Ingrese segundos validos.");
            t1.setSegundos(leer.nextInt());
        }
        }
        return t1;
    }
    public int imprimirHoraCompleta(Tiempo t1){
        for (int i = 0; i <= 24; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {
                    if (i<10) {
                        System.out.print("0"+i+":");
                    }else{
                        System.out.print(i+":");
                    }
                    if (j<10) {
                        System.out.print("0"+j+":");
                    }else{
                        System.out.print(j+":");
                    }
                    if (k<10) {
                        System.out.print("0"+k);
                    }else{
                        System.out.print(k);
                    }
                    System.out.println("");
                    if (i == t1.getHoras() && j == t1.getMinutos() && k == t1.getSegundos()) {
                        return 0;
                    }
                }

            }

        }
        return 0;
    }
}
