public class Ptak extends AbstraktZwierze {
    private double predkosc;

    public Ptak(String nazwa, int wiek, double rozpietoscSkrzydel) {
        super(nazwa, wiek);
        this.predkosc = predkosc;
    }

    @Override
    public String wydajDzwiek() {
        return "ćwierka";
    }

    @Override
    public String poruszajSie() {
        return "Leci";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Lasy i góry.";
    }

    public void pokazPredkosc() {
        System.out.println("Maksymalna predkość: " + predkosc );
    }
}