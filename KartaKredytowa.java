class KartaKredytowa extends KartaPlatnicza {
    private double limitKredytowy;

    public KartaKredytowa(double saldo, double limitKredytowy) {
        super(saldo);
        this.limitKredytowy = limitKredytowy;
    }


    @Override public void wykonajPlatnosc(double kwota) {
        if (saldo + limitKredytowy >= kwota) {
            saldo -= kwota;
            System.out.println("Płatność " + kwota + " PLN zaakceptowana. Nowe saldo: " + saldo + " PLN.");
        } else {
            System.out.println("Brak wystarczających środków, przekroczony limit kredytowy.");
        }
    }


    @Override public void doladuj(double kwota) {
        saldo += kwota;
        System.out.println("Doładowano " + kwota + " PLN. Nowe saldo: " + saldo + " PLN.");
    }
}
