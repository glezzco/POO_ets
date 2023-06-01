package posnet;

/**
 *
 * @author Jose Erenesto
  */
public class Persona {

    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    
    /**
     * 
     * @param DNI
     * @param nombre
     * @param apellido
     * @param telefono
     * @param mail 
     *
     *  a Continuacion tenemos el constructor para inicializar los atributos 
     * 
     */
    public Persona(String DNI, String nombre, String apellido, String telefono, String mail) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    /**
     * 
     * @return En este return damos el nombre completo del cliente 
     */
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

}
