package Entidad;

//@author Facundo Cruz
public class Sopa {

    private String matriz[][] = {
        {"a","b","r","i","r","c","i","c","l","o"},
        {"d","i","o","s","a","p","a","n","d","a"},
        {"s","e","ñ","a","l","l","u","n","a","r"},
        {"n","o","t","a","s","g","a","n","a","r"},
        {"b","o","l","s","a","v","o","l","a","r"},
        {"f","u","r","i","a","s","u","a","v","e"},
        {"c","a","n","t","a","b","r","o","m","a"},
        {"s","e","l","v","a","f","r","i","t","o"},
        {"s","a","b","i","o","g","o","l","p","e"},
        {"m","a","n","o","s","h","o","g","a","r"}
        };
    private String palabraEncontrar;

    public Sopa() {
        
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabraEncontrar() {
        return palabraEncontrar;
    }

    public void setPalabraEncontrar(String palabraEncontrar) {
        this.palabraEncontrar = palabraEncontrar;
    }

}
