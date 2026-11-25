public class PagoCriptomoneda extends MedioPago {
    private String direccionWallet, redBlockchain;
    public PagoCriptomoneda(String titular, String moneda, String wallet, String red) {
        super(titular, moneda); direccionWallet = wallet; redBlockchain = red;
    }
    @Override
    public boolean procesarCobro(double monto) {
        if (monto > 0) { System.out.println("Pago crypto confirmado en " + redBlockchain + " desde " + direccionWallet + ": " + monto + " " + moneda); return true; }
        return false;
    }
}