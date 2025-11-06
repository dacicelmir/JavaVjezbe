package com.udg.me;

public class Radnik {
    private int id;
    private String ime;
    private String prezime;
    private double plata;
    private int radniSati;
    private int prekovremeniSati;
    private double bonus;

    // Konstruktor
    public Radnik(int id, String ime, String prezime, double plata) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.plata = plata;
        this.radniSati = 160; // podrazumijevano 160 sati mjesečno
        this.prekovremeniSati = 0;
        this.bonus = 0;
    }

    // Getteri i setteri
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int getRadniSati() {
        return radniSati;
    }

    public void setRadniSati(int radniSati) {
        this.radniSati = radniSati;
    }

    public int getPrekovremeniSati() {
        return prekovremeniSati;
    }

    public void setPrekovremeniSati(int prekovremeniSati) {
        this.prekovremeniSati = prekovremeniSati;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
