package com.udg.me;

class Kombi extends Vozilo {
    private int kapacitetPutnika;

    public Kombi(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, double osnovnaCijena,
                 int kapacitetPutnika) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja, osnovnaCijena);
        this.kapacitetPutnika = kapacitetPutnika;
    }

    @Override
    public double izracunajCijenu() {
        double cijena = super.izracunajCijenu();
        if (kapacitetPutnika > 8)
            cijena += 30;
        return cijena;
    }

    @Override
    public void prikaziInfo() {
        super.prikaziInfo();
        System.out.println("Kapacitet putnika: " + kapacitetPutnika);
        System.out.println("Ukupna cijena registracije: " + izracunajCijenu() + " EUR");
        System.out.println("-----------------------------------");
    }
}
