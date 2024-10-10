class Oswietlenie extends InteligentneUrzadzenie {

    @Override public void wlacz() {
        System.out.println("Oświetlenie włączone.");
    }


    @Override public void wylacz() {
        System.out.println("Oświetlenie wyłączone.");
    }

    @Override public void ustawHarmonogram() {
        System.out.println("Ustawiono harmonogram dla oświetlenia.");
    }
}