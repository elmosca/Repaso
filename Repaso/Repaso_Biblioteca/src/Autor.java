public class Autor {
    //Atributos de la clase Autor
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    //Método constructor por defecto
    public Autor(){
        this.nombre= "";
        this.apellido= "";
        this.fechaNacimiento= "";
    }
    //Método constructor con parámetros
    public Autor(String nombre, String apellido, String fechaNacimiento){
        this.nombre= nombre;
        this.apellido= apellido;
        this.fechaNacimiento= fechaNacimiento;
    }
    //Método constructor de copia
    public Autor(Autor autor){
        this.nombre= autor.nombre;
        this.apellido= autor.apellido;
        this.fechaNacimiento= autor.fechaNacimiento;
    }
    //Métodos públicos de la clase Autor
    //Métodos get y set para los atributos de la clase Autor
    

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return String return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //Método toString
    @Override
    public String toString() {
        return "Autor [apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + "]";
    }

    //Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Autor other = (Autor) obj;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (fechaNacimiento == null) {
            if (other.fechaNacimiento != null)
                return false;
        } else if (!fechaNacimiento.equals(other.fechaNacimiento))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    //Método hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }


}