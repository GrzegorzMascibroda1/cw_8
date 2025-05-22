public class Ssak extends AbstraktZwierze {
    private String Kontynet;

    public Ssak(String nazwa, int wiek, String Kontynet) {
        super(nazwa, wiek);
        this.Kontynet = Kontynet;
    }

    @Override
    public String wydajDzwiek() {
        return "Ryczy!!!! ";
    }

    @Override
    public String poruszajSie() {
        return "biega";
    }

    @Override
    public String srodowiskoNaturalne() {
        return " cały świat";
    }

    public void pokazKontynet() {
        System.out.println("Kontynent: " + Kontynet);
    }
}