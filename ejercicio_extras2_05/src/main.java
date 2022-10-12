
import Entidad.Triangulo;
import Servicio.TrianguloService;
import java.util.Scanner;

//@author Facundo Cruz
public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TrianguloService sv = new TrianguloService();
        Triangulo triangulo[] = new Triangulo[4];
        int max = 0, aux = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Triangulo " + (i + 1));
            triangulo[i] = sv.crearTriangulo();
            System.out.println("Perimetro: " + sv.calcularPerimetro(triangulo[i]) + "cm");
            System.out.println("Area: " + sv.calcularArea(triangulo[i]) + "cm²");
            if (i == 0) {
                max = sv.calcularArea(triangulo[i]);
            }
            if (i > 0 && max < sv.calcularArea(triangulo[i])) {
                aux = i;
            }
            System.out.println("------------------------------------------");
        }
        System.out.println("Datos del triángulo con mayor superficie:");
        System.out.println(triangulo[aux]);
    }

}
