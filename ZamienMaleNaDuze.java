class ZamienMaleNaDuze extends OperacjaNaTekscie {

    @Override public String wykonaj(String tekst) {
        return tekst.toUpperCase();
    }

    @Override public String cofnij(String tekst) {
        return tekst.toLowerCase();
    }


    @Override public String nazwaOperacji() {
        return "Zamień małe na duże";
    }
}
