package com.udg.me;

class Vozilo {
    protected String proizvodjac;
    protected int godinaProizvodnje;
    protected int kubikaza;
    protected String boja;
    protected double osnovnaCijena;

    public Vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, double osnovnaCijena) {
        this.proizvodjac = proizvodjac;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kubikaza = kubikaza;
        this.boja = boja;
        this.osnovnaCijena = osnovnaCijena;
    }

    public double izracunajCijenu() {
        double cijena = osnovnaCijena;
        if (godinaProizvodnje < 2010)
            cijena += 30;
        if (kubikaza > 2000)
            cijena += 50;
        return cijena;
    }

    public void prikaziInfo() {
        System.out.println("Proizvođač: " + proizvodjac);
        System.out.println("Godina proizvodnje: " + godinaProizvodnje);
        System.out.println("Kubikaža: " + kubikaza);
        System.out.println("Boja: " + boja);
    }
}
