public class PagoBilleteraVirtual extends MedioPago {
    private String alias;
    private double limiteDiario, acumulado;
    public PagoBilleteraVirtual(String titular, String moneda, String alias, double limite) {
        super(titular, moneda); this.alias = alias; limiteDiario = limite; acumulado = 0;
    }
    @Override
    public boolean procesarCobro(double monto) {
        if (monto > 0 && acumulado + monto <= limiteDiario) {
            acumulado += monto;
            System.out.println("Pago con billetera " + alias + " aprobado: " + monto + " " + moneda);
            return true;
        }
        System.out.println("Pago rechazado por limite diario.");
        return false;
    }
}