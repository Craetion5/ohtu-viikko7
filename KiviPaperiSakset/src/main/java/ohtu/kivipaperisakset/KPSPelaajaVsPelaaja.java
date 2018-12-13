package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends KPSPelaaja {

    @Override
    protected void aloitaPeli() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        System.out.print("Toisen pelaajan siirto: ");
        tokanSiirto = scanner.nextLine();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();

            System.out.print("Toisen pelaajan siirto: ");
            tokanSiirto = scanner.nextLine();
        }
    }
}
