package com.udg.me;

class Automobil extends Vozilo {
    private int brojVrata;
    private String tipMotora; // "dizel" ili "benzin"

    public Automobil(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, double osnovnaCijena,
                     int brojVrata, String tipMotora) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja, osnovnaCijena);
        this.brojVrata = brojVrata;
        this.tipMotora = tipMotora;
    }

    @Override
    public double izracunajCijenu() {
        double cijena = super.izracunajCijenu();
        if (tipMotora.equalsIgnoreCase("dizel"))
            cijena += 20;
        return cijena;
    }

    @Override
    public void prikaziInfo() {
        super.prikaziInfo();
        System.out.println("Broj vrata: " + brojVrata);
        System.out.println("Tip motora: " + tipMotora);
        System.out.println("Ukupna cijena registracije: " + izracunajCijenu() + " EUR");
        System.out.println("-----------------------------------");
    }
}
