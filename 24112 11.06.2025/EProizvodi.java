package com.udg.me;

	abstract class EProizvod {
    protected String opis;
    protected String sifra;
    protected double uvoznaCijena;

    public EProizvod(String opis, String sifra, double uvoznaCijena) {
        this.opis = opis;
        this.sifra = sifra;
        this.uvoznaCijena = uvoznaCijena;
    }

    public abstract double izracunajMaloprodajnuCijenu();

    @Override
    public String toString() {
        return "Opis: " + opis + ", Šifra: " + sifra + ", Uvozna cijena: " + uvoznaCijena;
    }
}
