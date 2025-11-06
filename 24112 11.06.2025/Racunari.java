package com.udg.me;

class Racunari extends EProizvod {
    private String procesor;
    private int memorija;

    public Racunari(String opis, String sifra, double uvoznaCijena, String procesor, int memorija) {
        super(opis, sifra, uvoznaCijena);
        this.procesor = procesor;
        this.memorija = memorija;
    }

    @Override
    public double izracunajMaloprodajnuCijenu() {
        return uvoznaCijena * 1.3 + (memorija / 8.0) * 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Procesor: " + procesor + ", Memorija: " + memorija + "GB";
    }
}
