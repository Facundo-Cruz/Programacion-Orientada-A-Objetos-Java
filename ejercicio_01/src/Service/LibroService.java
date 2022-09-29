//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.

package Service;


//@author Facundo Cruz
import Entidad.Libro;
import java.util.Scanner;
public class LibroService {
    
    public Libro cargarLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro1 = new Libro();
        System.out.println("Ingrese el ISBN");
        libro1.ISBN = leer.nextInt();
        System.out.println("Ingrese el título");
        libro1.titulo = leer.next();
        System.out.println("Ingrese el autor");
        libro1.autor = leer.next();
        System.out.println("Ingrese el número de páginas");
        libro1.npagina = leer.nextInt();
        return libro1;
    }
    public void mostrarLibro(Libro libro1){
        System.out.println(libro1);
    }

    public LibroService() {
    }
    
}
