package com.udg.me;

public class ObracunPlate {
    private String mjesec;
    private int godina;
    private Radnik zaposleni;
    private double iznos;
    private String napomena; // npr. "prekovremeni rad", "bonus", itd.

    // Konstruktor
    public ObracunPlate(String mjesec, int godina, Radnik zaposleni, double iznos, String napomena) {
        this.mjesec = mjesec;
        this.godina = godina;
        this.zaposleni = zaposleni;
        this.iznos = iznos;
        this.napomena = napomena;
    }

    // Getteri i setteri
    public String getMjesec() {
        return mjesec;
    }

    public void setMjesec(String mjesec) {
        this.mjesec = mjesec;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Radnik getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Radnik zaposleni) {
        this.zaposleni = zaposleni;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }
}
