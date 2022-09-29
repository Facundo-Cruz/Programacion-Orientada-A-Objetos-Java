//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
//al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

package Servicio;

import Entidad.Matemática;


//@author Facundo Cruz

public class MatemáticaService {
    
    public double devolverMayor(Matemática op){
        return Math.max(op.getNumero1(), op.getNumero2());
    }
    
    public double calcularPotencia(Matemática op){
        double numMayor = Math.max(op.getNumero1(), op.getNumero2());
        double numMenor = Math.min(op.getNumero1(), op.getNumero2());
        return Math.pow(Math.round(numMayor),Math.round(numMenor));
    }
    
    public double calcularRaiz(Matemática op){
        double num = Math.min(op.getNumero1(), op.getNumero2());
        return Math.sqrt(Math.abs(num));
    }
}
