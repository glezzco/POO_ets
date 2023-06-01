package posnet;

/**
 *
 *@author Jose Erenesto
 */
public class TarjetaDeCredito {

    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    /**
     * 
     * @param entidadBancaria
     * @param nroTarjeta
     * @param saldo
     * @param titular
     * @param entidadFinanciera 
     */
    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }
    /**
     * 
     * @param monto
     * @return 
     */
    public boolean tieneSaldoDisponible(double monto) {
        return saldo >= monto;
    }
    /**
     * 
     * @param monto 
     */
    public void descontar(double monto) {
        saldo = saldo - monto;
        // saldo -= monto;
    }
    /**
     * 
     * @return 
     */
    public String nombreCompletoDeTitular() {
        return titular.nombreCompleto();
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

}
