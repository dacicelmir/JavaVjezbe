package com.udg.me;

class TV extends EProizvod {
    private double velicinaEkrana;

    public TV(String opis, String sifra, double uvoznaCijena, double velicinaEkrana) {
        super(opis, sifra, uvoznaCijena);
        this.velicinaEkrana = velicinaEkrana;
    }

    @Override
    public double izracunajMaloprodajnuCijenu() {
        return uvoznaCijena * 1.2 + velicinaEkrana * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ekran: " + velicinaEkrana + "\"";
    }
}
