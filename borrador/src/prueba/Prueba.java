

package prueba;

//@author Facundo Cruz

public class Prueba {

    public static void main(String[] args) {
        Auto a1 = new Auto();
        Auto a2 = new Auto();
        a1.setMarca("Nisan");
        a2.setMarca("ford");
        System.out.println(a1.getMarca());
        System.out.println(a2.getMarca());
        a1.setKm(0);
        a2.setKm(0);
        a1.sumarKm();
        a2.sumarKm();
        System.out.println(a1.getKm());
        System.out.println(a2.getKm());
    }

}
