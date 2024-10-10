abstract class KartaPlatnicza implements Platnosc {
    protected double saldo;

    public KartaPlatnicza(double saldo) {
        this.saldo = saldo;
    }

    public abstract void doladuj(double kwota);
}