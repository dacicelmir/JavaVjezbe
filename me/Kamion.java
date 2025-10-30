package com.udg.me;

class Kamion extends Vozilo {
    private double kapacitetTereta;
    private boolean prikolica;

    public Kamion(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, double osnovnaCijena,
                  double kapacitetTereta, boolean prikolica) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja, osnovnaCijena);
        this.kapacitetTereta = kapacitetTereta;
        this.prikolica = prikolica;
    }

    @Override
    public double izracunajCijenu() {
        double cijena = super.izracunajCijenu();
        if (prikolica)
            cijena += 50;
        return cijena;
    }

    @Override
    public void prikaziInfo() {
        super.prikaziInfo();
        System.out.println("Kapacitet tereta: " + kapacitetTereta + " t");
        System.out.println("Prikolica: " + (prikolica ? "Da" : "Ne"));
        System.out.println("Ukupna cijena registracije: " + izracunajCijenu() + " EUR");
        System.out.println("-----------------------------------");
    }
}
