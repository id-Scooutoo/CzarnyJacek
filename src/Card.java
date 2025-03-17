 class Card {
    private String nazwa;
    private int wartosc;

    public Card(String nazwa, int wartosc) {
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWartosc() {
        return wartosc;
    }

    @Override
    public String toString() {
        return nazwa + " (wartość: " + wartosc + ")";
    }
}
