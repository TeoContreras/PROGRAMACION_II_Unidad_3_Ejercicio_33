public class PagoTarjetaDebito extends MedioPago {
    private String numeroTarjeta, claveInterbancaria;
    public PagoTarjetaDebito(String titular, String moneda, String numero, String clave) {
        super(titular, moneda); numeroTarjeta = numero; claveInterbancaria = clave;
    }
    @Override
    public boolean procesarCobro(double monto) {
        if (monto > 0) { System.out.println("Cobro con debito aprobado para " + titular + ": " + monto + " " + moneda); return true; }
        return false;
    }
}