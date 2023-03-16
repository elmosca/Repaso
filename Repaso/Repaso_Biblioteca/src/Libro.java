public class Libro {
    //atributos para la clase libro
    private String titulo;
    private String autor;
    private String iSBN;
    private int añoPublicacion;
    private int numeroCopiasDisponibles;

    //Método constructor por defecto
    public Libro(){
        this.titulo= "";
        this.autor= "";
        this.iSBN= "";
        this.añoPublicacion= 0;
        this.numeroCopiasDisponibles= 0;
    }
    //Método constructor con parámetros
    public Libro(String titulo, String autor, String iSBN, int añoPublicacion, int numeroCopiasDisponibles){
        this.titulo= titulo;
        this.autor= autor;
        this.iSBN= iSBN;
        this.añoPublicacion= añoPublicacion;
        this.numeroCopiasDisponibles= numeroCopiasDisponibles;
    }
    //Método constructor de copia
    public Libro(Libro libro){
        this.titulo= libro.titulo;
        this.autor= libro.autor;
        this.iSBN= libro.iSBN;
        this.añoPublicacion= libro.añoPublicacion;
        this.numeroCopiasDisponibles= libro.numeroCopiasDisponibles;
    }

    /**
     * Métodos get y set para los atributos de la clase libro
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getNumeroCopiasDisponibles() {
        return numeroCopiasDisponibles;
    }

    public void setNumeroCopiasDisponibles(int numeroCopiasDisponibles) {
        this.numeroCopiasDisponibles = numeroCopiasDisponibles;
    }
    //método toString para mostrar la información del libro
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", iSBN='" + iSBN + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", numeroCopiasDisponibles=" + numeroCopiasDisponibles +
                '}';
    }
    //Método equals y hashCode para comparar dos objetos de la clase libro
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;

        if (añoPublicacion != libro.añoPublicacion) return false;
        if (numeroCopiasDisponibles != libro.numeroCopiasDisponibles) return false;
        if (titulo != null ? !titulo.equals(libro.titulo) : libro.titulo != null) return false;
        if (autor != null ? !autor.equals(libro.autor) : libro.autor != null) return false;
        return iSBN != null ? iSBN.equals(libro.iSBN) : libro.iSBN == null;
    }

    @Override
    public int hashCode() {
        int result = titulo != null ? titulo.hashCode() : 0;
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        result = 31 * result + (iSBN != null ? iSBN.hashCode() : 0);
        result = 31 * result + añoPublicacion;
        result = 31 * result + numeroCopiasDisponibles;
        return result;
    }
    //Método estático para validar el formato del ISBN
    public static boolean validarISBN(String isbn){
        if (isbn.length()!=13){
            return false;
        }
        int suma=0;
        for (int i=0; i<isbn.length(); i++){
            if (i%2==0){
                suma+=Character.getNumericValue(isbn.charAt(i));
            }else{
                suma+=Character.getNumericValue(isbn.charAt(i))*3;
            }
        }
        if (suma%10==0){
            return true;
        }else{
            return false;
        }
    }


}
