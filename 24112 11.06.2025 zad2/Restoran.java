package com.udg.me;

import java.util.ArrayList;

public class Restoran {
    private String naziv;
    private String adresa;
    private String pib;
    private ArrayList<Radnik> zaposleni;

    // Konstruktor
    public Restoran(String naziv, String adresa, String pib, ArrayList<Radnik> zaposleni) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.pib = pib;
        this.zaposleni = zaposleni;
    }

    // Getteri i setteri
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public ArrayList<Radnik> getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(ArrayList<Radnik> zaposleni) {
        this.zaposleni = zaposleni;
    }
}
