//• Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
//• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
//• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
//• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
//soluciones.
//• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
//en el caso en que se tenga una única solución posible.
//• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
package Servicio;

import Entidad.Ecuacion;
import java.util.Scanner;


//@author Facundo Cruz

public class EcuacionService {
    public Ecuacion definirEcuacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores de a,b y c");
        Ecuacion e1 = new Ecuacion(sc.nextInt(),sc.nextInt(),sc.nextInt());
        return e1;
    }
    public double getDiscriminante(Ecuacion e1){
        return (Math.pow((double)e1.getB(), 2.0)-4.0*(double)e1.getA()*(double)e1.getC());
    }
    public boolean tieneRaices(Ecuacion e1){
        return (getDiscriminante(e1)>0);
    }
    public boolean tieneRaiz(Ecuacion e1){
        return(getDiscriminante(e1)==0);
    }
    public void obtenerRaices(Ecuacion e1){
        if (tieneRaices(e1)) {
            double x1 =((double)e1.getB()*-1.0+Math.sqrt(getDiscriminante(e1)))/2.0*(double)e1.getA();
            double x2 =((double)e1.getB()*-1.0-Math.sqrt(getDiscriminante(e1)))/2.0*(double)e1.getA();
            System.out.println("x1: ("+x1+",0)");
            System.out.println("x2: ("+x2+",0)");
        }else{
            System.out.println("La ecuacion no tiene dos soluciones reales.");
        }
    }
    public void obtenerRaiz(Ecuacion e1){
        if (tieneRaiz(e1)) {
            double x1 =((double)e1.getB()*(-1.0))/(2.0*(double)e1.getA());
            System.out.println("x1: ("+x1+",0)");
            
        }else{
            System.out.println("La ecuación no tiene una única solución.");
        }
    }
    public void Calcular(Ecuacion e1){
        if(getDiscriminante(e1)<0){
            System.out.println("Error, no existen soluciones reales");
        }else{
            obtenerRaices(e1);
            obtenerRaiz(e1);
        }
    }
    
}
