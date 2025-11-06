package com.udg.me;

public class Konobar extends Radnik {
    private int brojStolova;

    // Konstruktor
    public Konobar(int id, String ime, String prezime, double plata, int brojStolova) {
        super(id, ime, prezime, plata);
        this.brojStolova = brojStolova;
    }

    // Getter i setter
    public int getBrojStolova() {
        return brojStolova;
    }

    public void setBrojStolova(int brojStolova) {
        this.brojStolova = brojStolova;
    }
}
