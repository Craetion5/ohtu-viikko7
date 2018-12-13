package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            if (vastaus.endsWith("a")) {
                PelinAloittaja.haastaPelaaja();
            } else if (vastaus.endsWith("b")) {
                PelinAloittaja.haastaTekoaly();
            } else if (vastaus.endsWith("c")) {
                PelinAloittaja.haastaParanneltuTekoaly();
            } else {
                break;
            }

        }

    }
}
