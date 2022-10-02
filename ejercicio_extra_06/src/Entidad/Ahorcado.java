/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;


//@author Facundo Cruz

public class Ahorcado {
    private String[] palabra;
    private int cantE = 0;
    private int cantM;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantE, int cantM) {
        this.palabra = palabra;
        this.cantE = cantE;
        this.cantM = cantM;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantE() {
        return cantE;
    }

    public void setCantE(int cantE) {
        this.cantE = cantE;
    }

    public int getCantM() {
        return cantM;
    }

    public void setCantM(int cantM) {
        this.cantM = cantM;
    }
    
}
