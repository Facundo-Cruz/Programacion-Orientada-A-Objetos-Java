//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
//operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
//saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

package ejercicio_5;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancaria c1 = new CuentaBancaria();
        c1 = c1.crearCuenta();
        int opc;
        do {
            System.out.println("\t .:MENÚ BANCO:.");
            System.out.println("1.Ingresar dinero.\n2.Retirar dinero.\n3.Extracción rápida.\n4.Consultar saldo.\n5.Consultar datos.\n6.Salir\nIngrese una opción.");
            System.out.println("-----------------------------");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    c1.ingresarDinero();
                    break;
                case 2:
                    c1.retirarDinero();
                    break;
                case 3:
                    c1.extraccionRapida();
                    break;
                case 4:
                    c1.consultarSaldo();
                    break;
                case 5:
                    System.out.println("+---------------------------+");
                    System.out.println(c1.consultarDatos());
                    System.out.println("+---------------------------+");
                    break;
                default:
                    if(opc!=6){
                        System.out.println("Opción inválida vuelve a intentarlo.");
                    }
            }
        } while (opc!=6);
        
    }

}
