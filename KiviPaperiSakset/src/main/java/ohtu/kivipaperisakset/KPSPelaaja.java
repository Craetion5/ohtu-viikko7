package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSPelaaja {

    protected Tuomari tuomari;
    protected static Scanner scanner;
    protected String ekanSiirto;
    protected String tokanSiirto;

    public KPSPelaaja() {
        tuomari = new Tuomari();
        scanner = new Scanner(System.in);
    }

    public void pelaa() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        aloitaPeli();
        System.out.println("\nKiitos!");
        System.out.println(tuomari);
    }

    protected boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    protected abstract void aloitaPeli();
}
