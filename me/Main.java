package com.udg.me;

public class Main {
    public static void main(String[] args) {
        Automobil a = new Automobil("Audi", 2008, 2200, "crna", 200, 4, "dizel");
        Kamion k = new Kamion("MAN", 2012, 3000, "bijela", 300, 12, true);
        Kombi ko = new Kombi("Volkswagen", 2005, 1900, "siva", 180, 9);

        a.prikaziInfo();
        k.prikaziInfo();
        ko.prikaziInfo();
    }
}
