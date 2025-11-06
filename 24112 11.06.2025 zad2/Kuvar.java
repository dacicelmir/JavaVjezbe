package com.udg.me;

public class Kuvar extends Radnik {
    private String specijalnost;

    // Konstruktor
    public Kuvar(int id, String ime, String prezime, double plata, String specijalnost) {
        super(id, ime, prezime, plata);
        this.specijalnost = specijalnost;
    }

    // Getter i setter
    public String getSpecijalnost() {
        return specijalnost;
    }

    public void setSpecijalnost(String specijalnost) {
        this.specijalnost = specijalnost;
    }
}
