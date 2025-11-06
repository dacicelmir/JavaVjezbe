package com.udg.me;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EProizvod> proizvodi = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Novi proizvod ---");
            System.out.print("Unesite opis proizvoda: ");
            String opis = sc.nextLine();
            System.out.print("Unesite šifru proizvoda (RA..., TE..., TV...): ");
            String sifra = sc.nextLine().toUpperCase();
            System.out.print("Unesite uvoznu cijenu: ");
            double cijena = sc.nextDouble();
            sc.nextLine();

            EProizvod p = null;

            if (sifra.startsWith("RA")) {
                System.out.print("Procesor: ");
                String proc = sc.nextLine();
                System.out.print("Memorija (GB): ");
                int mem = sc.nextInt();
                sc.nextLine();
                p = new Racunari(opis, sifra, cijena, proc, mem);
            } else if (sifra.startsWith("TE")) {
                System.out.print("Operativni sistem: ");
                String os = sc.nextLine();
                System.out.print("Veličina ekrana (inči): ");
                double ekran = sc.nextDouble();
                sc.nextLine();
                p = new Telefoni(opis, sifra, cijena, os, ekran);
            } else if (sifra.startsWith("TV")) {
                System.out.print("Veličina ekrana (inči): ");
                double ekran = sc.nextDouble();
                sc.nextLine();
                p = new TV(opis, sifra, cijena, ekran);
            } else {
                System.out.println("Nepoznata kategorija! Proizvod preskočen.");
            }

            if (p != null) proizvodi.add(p);

            System.out.print("\nŽelite li dodati još proizvoda? (da/ne): ");
            String odgovor = sc.nextLine().toLowerCase();
            if (!odgovor.equals("da")) break;
        }

        System.out.println("\n===== PREGLED PROIZVODA =====");
        for (EProizvod p : proizvodi) {
            System.out.println(p);
            System.out.println("Maloprodajna cijena: " + p.izracunajMaloprodajnuCijenu() + " €");
            System.out.println("--------------------------------------");
        }

        if (!proizvodi.isEmpty()) {
            double ukupno = 0;
            for (EProizvod p : proizvodi) {
                ukupno += p.izracunajMaloprodajnuCijenu();
            }
            System.out.println("Prosječna maloprodajna cijena: " + (ukupno / proizvodi.size()) + " €");
        }

        sc.close();
    }
}
