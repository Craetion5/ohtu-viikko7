package ohtu.kivipaperisakset;

public class PelinAloittaja {

    public static void haastaPelaaja() {
        new KPSPelaajaVsPelaaja().pelaa();
    }

    public static void haastaTekoaly() {
        new KPSTekoaly(new TekoalyYksinkertainen()).pelaa();
    }

    public static void haastaParanneltuTekoaly() {
        new KPSTekoaly(new TekoalyParannettu(20)).pelaa();
    }
}
