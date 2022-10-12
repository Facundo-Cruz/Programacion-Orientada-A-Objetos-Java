package Entidad;

public class Pass {
    private String pass;
    private String nombre;
    private int dni;

    public Pass() {
        this.nombre = "Facundo";
        this.dni = 44537914;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
}
