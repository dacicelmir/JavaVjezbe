package com.udg.me;

public class Menadzer extends Radnik {
    private String odjeljenje;

    // Konstruktor
    public Menadzer(int id, String ime, String prezime, double plata, String odjeljenje) {
        super(id, ime, prezime, plata);
        this.odjeljenje = odjeljenje;
    }

    // Getter i setter
    public String getOdjeljenje() {
        return odjeljenje;
    }

    public void setOdjeljenje(String odjeljenje) {
        this.odjeljenje = odjeljenje;
    }
}
