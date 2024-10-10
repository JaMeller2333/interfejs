class KartaDebetowa extends KartaPlatnicza {
    public KartaDebetowa(double saldo) {
        super(saldo);
    }

    @Override public void wykonajPlatnosc(double kwota) {
        if (saldo >= kwota) {
            saldo -= kwota;
            System.out.println("Płatność " + kwota + " PLN zaakceptowana. Nowe saldo: " + saldo + " PLN.");
        } else {
            System.out.println("Brak wystarczających środków na karcie debetowej.");
        }
    }

    @Override public void doladuj(double kwota) {
        saldo += kwota;
        System.out.println("Doładowano " + kwota + " PLN. Nowe saldo: " + saldo + " PLN.");
    }
}
