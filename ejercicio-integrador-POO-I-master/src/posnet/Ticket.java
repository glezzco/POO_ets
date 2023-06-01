package posnet;

/**
 *
 * @author Jose Erenesto
 */
public class Ticket {

    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;
    
    /**
     * 
     * @param nombreApellido
     * @param montoTotal
     * @param montoPorCuota 
     */
    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montoTotal=" + montoTotal + ", montoPorCuota=" + montoPorCuota + '}';
    }
    
}
