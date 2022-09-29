//5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
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

package ejercicio_05;

//@author Facundo Cruz

import Entidad.cuentaBancaria;
import Servicio.cuentaBancariaService;
import java.util.Scanner;


public class Ejercicio_05 {

    public static void main(String[] args) {
        cuentaBancariaService accion = new cuentaBancariaService();
        Scanner leer = new Scanner(System.in);
        cuentaBancaria O1 = accion.crearCuenta();
        int opc,cant;
        do {
            System.out.println("\t.:MENU:.\n1.Ingresar dinero\n2.Retirar dinero\n3.Extracción rápida\n4.Consultar saldo\n5.Consultar datos\n6.Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cuánto dinero desea ingresar?");
                    accion.ingresarDinero(O1, leer.nextInt());
                    break;
                case 2:
                    System.out.println("¿Cuánto dinero desea retirar?");
                    accion.retirarDinero(O1, leer.nextInt());
                    break;
                case 3:
                    System.out.println("¿Cuánto dinero desea retirar?");
                    accion.extraccionRapida(O1, leer.nextInt());
                    break;
                case 4:
                    System.out.println("Saldo actual: "+O1.getSaldoActual());
                    break;
                case 5:
                    System.out.println(O1.toString());
                    break;
    
                default:
                    if (opc!=6) {
                        System.out.println("Ingrese una opción valida.");
                    }
            }
        } while (opc!=6);
        
    }

}
