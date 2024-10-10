public class Main {
    public static void main(String[] args) {
        Zwierze pies = new Pies();
        pies.wydajDzwiek();
        pies.poruszajSie();

        Zwierze kot = new Kot();
        kot.wydajDzwiek();
        kot.poruszajSie();

        KartaPlatnicza kartaDebetowa = new KartaDebetowa(500);
        kartaDebetowa.wykonajPlatnosc(100);
        kartaDebetowa.doladuj(50);

        KartaPlatnicza kartaKredytowa = new KartaKredytowa(1000, 2000);
        kartaKredytowa.wykonajPlatnosc(1200);
        kartaKredytowa.doladuj(500);

        OperacjaNaTekscie operacja1 = new ZamienMaleNaDuze();
        System.out.println(operacja1.wykonaj("testowanie"));
        System.out.println(operacja1.cofnij("TESTOWANIE"));

        OperacjaNaTekscie operacja2 = new UsunSpacje();
        System.out.println(operacja2.wykonaj("To jest test"));
        System.out.println(operacja2.cofnij("Tojesttest"));

        InteligentneUrzadzenie termostat = new Termostat();
        termostat.wlacz();
        termostat.ustawHarmonogram();

        InteligentneUrzadzenie oswietlenie = new Oswietlenie();
        oswietlenie.wlacz();
        oswietlenie.ustawHarmonogram();
    }
}