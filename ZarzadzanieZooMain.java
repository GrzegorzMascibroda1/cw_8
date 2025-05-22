public class ZarzadzanieZooMain {
    public static void main(String[] args) {
        Ssak lew = new Ssak("Lew", 5, "Afryka");
        Ptak orzel = new Ptak("Orzeł", 3, 50);
        Gad waz = new Gad("Wąż", 2, true);

        orzel.wyswietlInformacje();
        System.out.println("Dźwięk: " + orzel.wydajDzwiek());
        System.out.println("Poruszanie: " + orzel.poruszajSie());
        System.out.println("Środowisko: " + orzel.srodowiskoNaturalne());
        System.out.println();

        waz.wyswietlInformacje();
        System.out.println("Dźwięk: " + waz.wydajDzwiek());
        System.out.println("Poruszanie: " + waz.poruszajSie());
        System.out.println("Środowisko: " + waz.srodowiskoNaturalne());
        System.out.println();

        lew.wyswietlInformacje();
        System.out.println("Dźwięk: " + lew.wydajDzwiek());
        System.out.println("Poruszanie: " + lew.poruszajSie());
        System.out.println("Środowisko: " + lew.srodowiskoNaturalne());
        System.out.println();


    }
}
