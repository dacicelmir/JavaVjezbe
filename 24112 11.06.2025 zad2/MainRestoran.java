package com.udg.me;

import java.util.ArrayList;

public class MainRestoran {
    public static void main(String[] args) {
        // Kreiramo listu zaposlenih
        ArrayList<Radnik> zaposleni = new ArrayList<>();

        // Dodajemo radnike
        Konobar k1 = new Konobar(1, "Marko", "Markovic", 600, 5);
        Kuvar kuvar1 = new Kuvar(2, "Jovan", "Jovic", 900, "Riblja jela");
        Menadzer m1 = new Menadzer(3, "Mila", "Milic", 1200, "Uprava");
        Konobar k2 = new Konobar(4, "Stefan", "Petrovic", 620, 4);
        Kuvar kuvar2 = new Kuvar(5, "Ana", "Perovic", 950, "Poslastičar");

        // Postavljamo radne sate, prekovremene i bonuse
        k1.setPrekovremeniSati(10);
        k1.setBonus(50);

        kuvar1.setPrekovremeniSati(5);
        kuvar1.setBonus(100);

        m1.setPrekovremeniSati(0);
        m1.setBonus(200);

        k2.setPrekovremeniSati(8);
        k2.setBonus(40);

        kuvar2.setPrekovremeniSati(12);
        kuvar2.setBonus(80);

        // Dodajemo ih u listu
        zaposleni.add(k1);
        zaposleni.add(kuvar1);
        zaposleni.add(m1);
        zaposleni.add(k2);
        zaposleni.add(kuvar2);

        // Kreiramo restoran
        Restoran restoran = new Restoran("Restoran Dobar Zalogaj", "Bulevar 21, Podgorica", "123456789", zaposleni);

        // Kreiramo listu obračuna plata
        ArrayList<ObracunPlate> obracuni = new ArrayList<>();

        // Generišemo obračune (prekovremeni se plaćaju 5 € po satu)
        for (Radnik r : restoran.getZaposleni()) {
            double iznos = r.getPlata() + (r.getPrekovremeniSati() * 5) + r.getBonus();
            String napomena = "";
            if (r.getPrekovremeniSati() > 0) napomena += "Prekovremeni rad: " + r.getPrekovremeniSati() + "h ";
            if (r.getBonus() > 0) napomena += "Bonus: " + r.getBonus() + "€";
            obracuni.add(new ObracunPlate("Oktobar", 2025, r, iznos, napomena));
        }

        // Ispis tabelarnog pregleda
        System.out.println("---------------------------------------------------------------");
        System.out.println("OBRAČUN PLATA ZA " + "OKTOBAR 2025");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-25s\n", "IME", "PREZIME", "IZNOS (€)", "NAPOMENA");
        System.out.println("---------------------------------------------------------------");

        double ukupno = 0;
        for (ObracunPlate o : obracuni) {
            System.out.printf("%-15s %-15s %-10.2f %-25s\n",
                    o.getZaposleni().getIme(),
                    o.getZaposleni().getPrezime(),
                    o.getIznos(),
                    o.getNapomena());
            ukupno += o.getIznos();
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("UKUPAN TROŠAK PLATA: %.2f €\n", ukupno);
        System.out.println("---------------------------------------------------------------");
    }
}
