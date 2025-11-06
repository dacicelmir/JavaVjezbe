package com.udg.me;

class Telefoni extends EProizvod {
    private String operativniSistem;
    private double velicinaEkrana;

    public Telefoni(String opis, String sifra, double uvoznaCijena, String operativniSistem, double velicinaEkrana) {
        super(opis, sifra, uvoznaCijena);
        this.operativniSistem = operativniSistem;
        this.velicinaEkrana = velicinaEkrana;
    }

    @Override
    public double izracunajMaloprodajnuCijenu() {
        return uvoznaCijena * 1.25 + velicinaEkrana * 5;
    }

    @Override
    public String toString() {
        return super.toString() + ", OS: " + operativniSistem + ", Ekran: " + velicinaEkrana + "\"";
    }
}
