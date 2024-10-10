class UsunSpacje extends OperacjaNaTekscie {

    @Override public String wykonaj(String tekst) {
        return tekst.replace(" ", "");
    }


    @Override public String cofnij(String tekst) {
        StringBuilder wynik = new StringBuilder();
        for (char c : tekst.toCharArray()) {
            wynik.append(c);
            if (Character.isUpperCase(c)) {
                wynik.append(" ");
            }
        }
        return wynik.toString().trim();
    }

    @Override public String nazwaOperacji() {
        return "Usuń spacje";
    }
}
