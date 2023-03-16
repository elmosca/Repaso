public class Main {
    public static void main(String[] args) {
        //Creamos un objeto de la clase libro
        Libro libro1 = new Libro ( "El principito", "Antoine de Saint-Exupéry", "978-84-204-2222-2", 1943, 5 );
        //Creamos un objeto de la clase biblioteca
        Biblioteca biblioteca1 = new Biblioteca ( );
        //Agregamos el libro a la biblioteca
        biblioteca1.agregarLibro ( libro1 );
        //Creamos un objeto de la clase libro
        Libro libro2 = new Libro ( "El señor de los anillos: Las dos torres", "J. R. R. Tolkien", "978-84-204-2222-2", 1954, 5 );
        //Agregamos el libro a la biblioteca
        biblioteca1.agregarLibro ( libro2 );
        //Creamos un objeto de la clase libro
        Libro libro3 = new Libro ( "El señor de los anillos: El retorno del rey", "J. R. R. Tolkien", "978-84-204-2222-2", 1955, 5 );
        //Agregamos el libro a la biblioteca
        biblioteca1.agregarLibro ( libro3 );
        //Creamos un objeto de la clase libro
        Libro libro4 = new Libro ( "El alquimista", "Paulo Coelho", "978-84-204-2222-2", 1988, 5 );
        //Agregamos el libro a la biblioteca
        biblioteca1.agregarLibro ( libro4 );
        //Creamos un objeto de la clase libro
        Libro libro5 = new Libro ( "El diario de Ana Frank", "Ana Frank", "978-84-204-2222-2", 1947, 5 );
        //Agregamos el libro a la biblioteca
        biblioteca1.agregarLibro ( libro5 );
        //Creamos un objeto de la clase libro
        Libro libro6 = new Libro ( "La metamorfosis", "Franz Kafka", "978-84-204-2222-2", 1915, 5 );
        //Agregamos el libro a la biblioteca
        biblioteca1.agregarLibro ( libro6 );

        //Verificamos si el libro 1 está en la biblioteca
        if (biblioteca1.buscarLibro ( libro1.getiSBN ( ) ) != null) {
            System.out.println ( "El libro 1 está en la biblioteca" );
        }
        //mostramos un listado con los libros de la biblioteca
        biblioteca1.mostrarInfo ( );


    }
}