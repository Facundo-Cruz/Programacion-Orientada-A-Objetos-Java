

//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
//saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

package Servicio;

import Entidad.cuentaBancaria;
import java.util.Scanner;


//@author Facundo Cruz

public class cuentaBancariaService {
    Scanner leer = new Scanner(System.in);
    public cuentaBancaria crearCuenta(){
        cuentaBancaria O1 = new cuentaBancaria();
        System.out.println("Ingrese un número de cuenta");
        O1.setNumeroCeunta(leer.nextInt());
        System.out.println("Ingrese se número de DNI");
        O1.setDNI(leer.nextInt());
        System.out.println("Cuenta creada con éxito. Su saldo actual es $0.");
        return O1;
    }
    public void ingresarDinero(cuentaBancaria O1, int cant){
        O1.setSaldoActual(O1.getSaldoActual()+cant);
        System.out.println("Dinero ingresado con éxito.");
    }
    public void retirarDinero(cuentaBancaria O1, int cant){
        if (cant-O1.getSaldoActual()<0) {
            System.out.println("No tienes saldo suficiente, solo te retiramos $"+O1.getSaldoActual());
            O1.setSaldoActual(0);
        }else{
            O1.setSaldoActual(O1.getSaldoActual()-cant);
            System.out.println("Su dinero ha sido retirado con éxito.");
        }
    }
    public void extraccionRapida(cuentaBancaria O1, int cant){
        if (cant > O1.getSaldoActual()*0.2) {
            if (true) {
                System.out.println("Error. Estás intentando sacar más del 20% solo retiramos $"+O1.getSaldoActual()*0.2);
                O1.setSaldoActual(O1.getSaldoActual()-(int)(O1.getSaldoActual()*0.2));
            }
        }
    }
    public void consultarSaldo(cuentaBancaria O1){
        System.out.println("Su sueldo actual es: "+O1.getSaldoActual());
    }
    
}
