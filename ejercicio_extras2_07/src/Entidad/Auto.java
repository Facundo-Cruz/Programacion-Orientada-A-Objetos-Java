//Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
//vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
//Crear métodos que permitan:
//● Que un usuario cargue su ficha del auto.
//● Que el usuario, modifique la titularidad del vehículo.
//● Indicar un trayecto recorrido, modificando de este modo los KM del motor
//● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
//al llegar a los 10.000km corresponde realizarlo.
package Entidad;

import java.util.Date;

//@author Facundo Cruz
public class Auto {

    private String nameOwner;
    private Date fechaVencimiento;
    private String color;
    private int km;

    public Auto() {
        this.km = 7500;
    }

    public Auto(String nameOwner, Date fechaVencimiento, String color) {
        this.nameOwner = nameOwner;
        this.fechaVencimiento = fechaVencimiento;
        this.color = color;
        this.km = 7500;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int year, int month, int day) {
        this.fechaVencimiento = new Date(year-1900, month-1, day);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Auto{" + "nameOwner=" + nameOwner + ", fechaVencimiento=" + fechaVencimiento + ", color=" + color + ", km=" + km + '}';
    }
    
    

}
