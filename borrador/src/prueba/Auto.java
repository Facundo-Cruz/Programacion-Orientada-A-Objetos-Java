/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

import java.util.Scanner;


//@author Facundo Cruz

public class Auto {
    private String marca;
    private String modelo;
    private int km;
    Scanner leer = new Scanner(System.in);
    public Auto() {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKm() {
        return km;
    }
    public void sumarKm(){
        System.out.println("Ingrese la cantidad de km a sumar");
        int kms = leer.nextInt();
        km += kms;
    }
    
}
