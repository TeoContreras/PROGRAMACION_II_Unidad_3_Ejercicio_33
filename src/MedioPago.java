public abstract class MedioPago {
    protected String titular, moneda;
    public MedioPago(String titular, String moneda) { this.titular = titular; this.moneda = moneda; }
    public abstract boolean procesarCobro(double monto);
}