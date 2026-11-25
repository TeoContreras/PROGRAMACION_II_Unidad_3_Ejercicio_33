public class main {
    public static void main(String[] args) {
        MedioPago[] medios = new MedioPago[3];
        medios[0] = new PagoTarjetaDebito("Ana", "ARS", "123456", "CBU001");
        medios[1] = new PagoCriptomoneda("Luis", "USDT", "WALLET01", "Ethereum");
        medios[2] = new PagoBilleteraVirtual("Marta", "ARS", "marta.mp", 50000);
        for (int i = 0; i < medios.length; i++) medios[i].procesarCobro(15000);
    }
}