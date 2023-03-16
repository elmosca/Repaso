import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    //Atributo listadoLibros de los libros List<Libro>;
    private List<Libro> listadoLibros;

    //Método constructor por defecto
    public Biblioteca(){
        this.listadoLibros= new ArrayList<Libro> ();
    }
    //Método constructor con parámetros
    public Biblioteca(List<Libro> listadoLibros){
        this.listadoLibros= listadoLibros;
    }
    //constructor de copia
    public Biblioteca(Biblioteca biblioteca){
        this.listadoLibros= biblioteca.listadoLibros;
    }

    //Método para agregar un libro al listado de libros
    public void agregarLibro(Libro libro){
        this.listadoLibros.add(libro);
    }
    //Método para eliminar un libro del listado de libros
    public void eliminarLibro(Libro libro){
        this.listadoLibros.remove(libro);
    }
    //Método para buscar un libro en el listado utilizando el ISBN
    public Libro buscarLibro(String iSBN){
        for (int i=0; i<this.listadoLibros.size(); i++){
            if (this.listadoLibros.get(i).getiSBN().equals(iSBN)){
                return this.listadoLibros.get(i);
            }
        }
        return null;
    }
    //Método para actualizar el número de copias disponibles de un libro
    public void actualizarCopiasDisponibles(String iSBN, int numeroCopiasDisponibles){
        for (int i=0; i<this.listadoLibros.size(); i++){
            if (this.listadoLibros.get(i).getiSBN().equals(iSBN)){
                this.listadoLibros.get(i).setNumeroCopiasDisponibles(numeroCopiasDisponibles);
            }
        }
    }
    // Método toString para mostrar información de todos los libros en la biblioteca
    public String toString(){
        String info= "";
        for (int i=0; i<this.listadoLibros.size(); i++){
            info+= this.listadoLibros.get(i).toString();
        }
        return info;
    }
    //Método toString para mostrar información de todos los libros en la biblioteca
    public void mostrarInfo(){
        for (int i=0; i<this.listadoLibros.size(); i++){
            System.out.println(this.listadoLibros.get(i).toString());
        }
    }
    //Método equals para comparar dos objetos de la clase Biblioteca
    public boolean equals(Biblioteca biblioteca){
        if (this.listadoLibros.equals(biblioteca.listadoLibros)){
            return true;
        }
        return false;
    }
    //Método hashCode para comparar dos objetos de la clase Biblioteca
    public int hashCode(){
        return this.listadoLibros.hashCode();
    }


}
