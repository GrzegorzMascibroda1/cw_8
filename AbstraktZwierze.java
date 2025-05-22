public abstract class AbstraktZwierze {
    protected String nazwa;
    protected int wiek;

    public AbstraktZwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public abstract String wydajDzwiek();
    public abstract String poruszajSie();
    public abstract String srodowiskoNaturalne();

    public void wyswietlInformacje() {
        System.out.println("Zwierzę: " + nazwa + ", Wiek: " + wiek);
    }
}