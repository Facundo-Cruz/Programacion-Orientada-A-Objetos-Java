//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.

package Entidad;


//@author Facundo Cruz

public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int npagina;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int npagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.npagina = npagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", npagina=" + npagina + '}';
    }
    
}
