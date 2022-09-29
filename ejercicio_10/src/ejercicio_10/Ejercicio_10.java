//Clase Arrays
//
//10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.

package ejercicio_10;

//@author Facundo Cruz




public class Ejercicio_10 {

    public static void main(String[] args) {
        double arregloA[]=new double[50];
        double arregloB[]=new double[20];
        double varAux;
        //Rellenamos vectorA con valores real aleatorios y lo vamos imprimiendo.
        System.out.println("ArregloA aleatorio: ");
        for (int i = 0; i < 50; i++) {
            arregloA[i]=Math.round(Math.random()*20);
            System.out.print("["+arregloA[i]+"] ");
        }
         System.out.println("");
        //Ordenamos el vectorA de menor a mayor.
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 49; j++) {
                if(arregloA[j]>arregloA[j+1]){
                    varAux = arregloA[j];
                    arregloA[j] = arregloA[j+1];
                    arregloA[j+1] = varAux;
                }
            }
        }
       //Llenamos vectorB con las condiciones del enunciado.
        for (int i = 0; i < 20; i++) {
            if (i<=9) {
                arregloB[i] = arregloA[i];
            }else{
                arregloB[i] = 0.5;
            }
        }
        
         System.out.println("ArregloA ordenado: ");
        //Imprimimos el vectorA ordenado con el for mejorado.
        for(double i:arregloA){
            System.out.print("["+i+"] ");
        }
        System.out.println("");
        //Imprimimos el vectorB con el for mejorado.
        System.out.println("ArregloB: ");
        for(double i:arregloB){
            System.out.print("["+i+"] ");
        }
        System.out.println("");
    }

}
