//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.

package ejercicio_1;

//@author Facundo Cruz

import Libro.Libro;
import java.util.Scanner;


public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro();
        System.out.println("Ingrese el ISBN");
        String isbn = leer.nextLine();
        System.out.println("Ingrese el título");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        String autor = leer.nextLine();
        System.out.println("Ingrese el número de páginas ");
        int npagina = leer.nextInt();
        libro1.LlenarDatos(isbn, titulo, autor, npagina);
        libro1.MostrarDatos();
    }

}
