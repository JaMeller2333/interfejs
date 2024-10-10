class Termostat extends InteligentneUrzadzenie {

    @Override public void wlacz() {
        System.out.println("Termostat włączony.");
    }


    @Override public void wylacz() {
        System.out.println("Termostat wyłączony.");
    }


    @Override public void ustawHarmonogram() {
        System.out.println("Ustawiono harmonogram dla termostatu.");
    }
}
