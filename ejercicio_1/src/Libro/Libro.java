//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.

package Libro;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int npagina;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int npagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.npagina = npagina;
    }

    public void LlenarDatos(String ISBN, String titulo, String autor, int npagina){
        this.ISBN = ISBN;
        this.titulo = titulo; 
        this.autor = autor;
        this.npagina = npagina;
    }
    public void MostrarDatos(){
        System.out.println("El ISBN es: "+ISBN);
        System.out.println("El título es: "+titulo);
        System.out.println("El autor es: "+autor);
        System.out.println("La cantidad de páginas es: "+npagina);
    }
}
