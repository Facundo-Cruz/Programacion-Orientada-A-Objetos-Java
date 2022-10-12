package Servicio;

import Entidad.Pass;
import java.util.Scanner;

public class PassService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPass(Pass c1) {
        System.out.println("Ingrese una contraseña de 10 carácteres.");
        c1.setPass(leer.next());
        while (c1.getPass().length() != 10) {
            System.out.println("La contraseña no cumple con el requisito. Vuelve a intentarlo.");
            c1.setPass(leer.nextLine());
        }
        System.out.println("Contraseña creada con éxito.");
    }

    public void analizarPass(Pass c1) {
        int M = 0;
        int A = 0;
        for (int i = 0; i < 10; i++) {
            if ("z".equalsIgnoreCase(String.valueOf(c1.getPass().charAt(i)))) {
                M++;
            }
            if ("a".equalsIgnoreCase(String.valueOf(c1.getPass().charAt(i)))) {
                A++;
            }
        }
        if (A > 1 && M > 0) {
            System.out.println("Su contraseña es de nivel Alto");
        } else if (M > 0) {
            System.out.println("Su contraseña es de nivel Medio");
        } else {
            System.out.println("Su contraseña es de nivel Bajo");
        }
    }

    public void acceso(Pass c1) {
        System.out.println("Ingrese su contraseña");
        String pass = leer.next();
        while (!pass.equals(c1.getPass())) {
            System.out.println("Contraseña incorrecta, vuelve a intentarlo");
            pass = leer.next();
        }
    }

    public void modificarNombre(Pass c1) {
        acceso(c1);
        System.out.println("Ingrese el nuevo nombre");
        String newName = leer.next();
        while (newName.equals(c1.getNombre())) {
            System.out.println("Nombre igual al anterior, porfavor ingrese uno distinto");
            newName = leer.next();
        }
        c1.setNombre(newName);
        System.out.println("Nombre cambiado con éxito");
    }

    public void modificarDni(Pass c1) {
        acceso(c1);
        System.out.println("Ingrese el nuevo Dni");
        int newDni = leer.nextInt();
        while (newDni == c1.getDni()) {
            System.out.println("Dni igual al anterior, porfavor ingrese uno distinto");
            newDni = leer.nextInt();
        }
        c1.setDni(newDni);
        System.out.println("Dni cambiado con éxito");
    }
}
