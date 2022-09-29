//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
//los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
//no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

package Servicio;


//@author Facundo Cruz
import Entidad.Operacion;
import java.util.Scanner;

public class Servicio {

    public Servicio() {
    }
    public void crearOperacion(Operacion O1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        O1.setNumero1(leer.nextInt());
        System.out.println("Ingrese otro número");
        O1.setNumero2(leer.nextInt());
    }
    public int Sumar(Operacion O1){
        return(O1.getNumero1()+O1.getNumero2());
    }
    public int Restar(Operacion O1){
        return(O1.getNumero1()-O1.getNumero2());
    }
    public int Multiplicar(Operacion O1){
        if(O1.getNumero1()==0||O1.getNumero2()==0){
            System.out.println("Error.");
            return 0;
        }else{
            return(O1.getNumero1()*O1.getNumero2());
        }
    }
    public double Dividir(Operacion O1){
        if(O1.getNumero1()==0||O1.getNumero2()==0){
            System.out.println("Error.");
            return 0;
        }else{
            return((double)O1.getNumero1()/(double)O1.getNumero2());
        }
    }
}
