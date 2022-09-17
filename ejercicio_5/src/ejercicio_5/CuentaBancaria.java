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

public class CuentaBancaria {

    private int numeroCuenta;
    private long DNI;
    private int saldoActual;
    Scanner leer = new Scanner(System.in);

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public CuentaBancaria crearCuenta() {
        CuentaBancaria obt1 = new CuentaBancaria();
        System.out.println("Ingrese un número de cuenta.");
        obt1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI.");
        obt1.setDNI(leer.nextLong());
        obt1.setSaldoActual(0);
        return obt1;
    }

    public void ingresarDinero() {
        System.out.println("¿Cuánto dinero deseas ingresar?");
        double cant = leer.nextInt();
        saldoActual += cant;
        System.out.println("Operación exitosa.");
    }

    public void retirarDinero() {
        System.out.println("¿Cuánto dinero desea retirar?");
        double cant = leer.nextInt();
        if (saldoActual - cant < 0) {
            System.out.println("Has excedido tu sueldo actual, solo pudimos retirar $" + saldoActual);
            saldoActual = 0;
        } else {
            cant = saldoActual - cant;
            saldoActual = (int) cant;
            System.out.println("Operación exitosa.");
        }
    }

    public void extraccionRapida() {
        System.out.println("¿Cuánto dinero deseas retirar?");
        int cant = leer.nextInt();
        while (cant > 0.20 * saldoActual) {
            System.out.println("Error, la cantidad ingresada supera el 20% del saldo actual. Vuelve a intentarlo.");
            cant = leer.nextInt();
        }
        cant = saldoActual - cant;
        saldoActual = cant;
        System.out.println("Has retirado el dinero exitosanemnte.");

    }

    public void consultarSaldo() {
        System.out.println("Tu saldo disponible es $" + saldoActual);
    }

    public String consultarDatos() {
        return "Número de cuenta: " + numeroCuenta + "\n DNI: " + DNI + "\n Saldo actual: $" + saldoActual;

    }
}
