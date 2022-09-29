
package Servicio;

//@author Facundo Cruz

import Entidad.Cadena;

public class CadenaService {
    //Este método no es parte de las consignas. Fue creado para ahorrar código
    //y hacerlo más legible.
    public boolean verificarChar(String frase, char caracter){
        return (frase.contains(String.valueOf(caracter).toLowerCase()));
    }
    public void mostrarVocales(Cadena fraseU){
        int cont = 0;
        for (int i = 0; i < fraseU.getLongitud(); i++) {
            if (verificarChar("aeiou", fraseU.getFrase().charAt(i))) {
                cont++;
            }
        }
        System.out.println("Cantidad de vocales encontradas: "+cont);
    }
    public void invertirFrase(Cadena fraseU){
        String fraseI = "";
        for (int i = fraseU.getLongitud()-1; i >=0 ; i--) {
            fraseI = fraseI.concat(String.valueOf(fraseU.getFrase().charAt(i)));
        }
        System.out.println(fraseI);
    }  
    public void vecesRepetido(String letra, Cadena fraseU){
        int cont = 0;
        for (int i = 0; i < fraseU.getLongitud(); i++) {
            if(verificarChar(letra.toLowerCase(), fraseU.getFrase().charAt(i))){
                cont++;
            }
        }
        System.out.println("El carácter se repite "+cont+" veces.");
    }
    public void compararLongitud(String fraseNueva, Cadena fraseU){
        if (fraseNueva.length()==fraseU.getLongitud()) {
            System.out.println("Las dos frases tienes la misma longitud.");
        }else if (fraseNueva.length()<fraseU.getLongitud()) {
            System.out.println("La frase más larga fue la ingresada inicialmente.");
        }else{
            System.out.println("La frase nueva es más larga.");
        }
    }
    public void unirFrase(String fraseNueva, Cadena fraseU){
        String unir = fraseU.getFrase().concat(fraseNueva);
        System.out.println(unir);
    }
    public void reemplazar(String caracter, Cadena fraseU){
        String newFrase = fraseU.getFrase().replace("A", "a");
        newFrase = newFrase.replace("a",caracter);
        System.out.println(newFrase);
    }
    public void contiene(String letra, Cadena fraseU){
        if (fraseU.getFrase().contains(letra)) {
            System.out.println("Si se encuentra la letra en la frase.");
        }else{
            System.out.println("La letra no se encuentra en la frase.");
        }
    }
    
} 