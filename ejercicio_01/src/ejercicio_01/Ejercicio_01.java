//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.

package ejercicio_01;

//@author Facundo Cruz
import Service.LibroService;
import Entidad.Libro;
public class Ejercicio_01 {

    public static void main(String[] args) {
        //Instanciamos los servicios
        LibroService libroservice = new LibroService();
        //Instanciamos objeto "libro1" y cargamos el libro
        Libro libro1 = libroservice.cargarLibro();
        //Mostramos el libro
        libroservice.mostrarLibro(libro1);
    }

}
