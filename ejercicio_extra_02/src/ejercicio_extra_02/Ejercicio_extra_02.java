package ejercicio_extra_02;

//@author Facundo Cruz
import Entidad.Punto;
import Servicio.PuntoService;

public class Ejercicio_extra_02 {

    public static void main(String[] args) {
        PuntoService ps = new PuntoService();
        Punto p1 = ps.crearPunto(1);
        Punto p2 = ps.crearPunto(2);
        ps.CalcDistancia(p1, p2);

    }

}
