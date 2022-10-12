package Entidad;

//@author Facundo Cruz
public class Triangulo {

    private int A;
    private int B;
    private int C;

    public Triangulo() {
    }

    public Triangulo(int A, int B) {
        this.A = A;
        this.B = B;
        this.C = B;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "A=" + A + ", B=" + B + ", C=" + C + '}';
    }

}
