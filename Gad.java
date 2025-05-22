public class Gad extends AbstraktZwierze {
    private boolean jestJadowity;

    public Gad(String nazwa, int wiek, boolean jestJadowity) {
        super(nazwa, wiek);
        this.jestJadowity = jestJadowity;
    }

    @Override
    public String wydajDzwiek() {
        return "syczy!!";
    }

    @Override
    public String poruszajSie() {
        return "pełza po ziemi.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Dżungle bagna i pustynie.";
    }

    public void sprawdzJadowitosc() {
        System.out.println(jestJadowity ? "Jestem jadowity!" : "Nie jestem jadowity.");
    }
}