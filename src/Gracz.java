import java.util.ArrayList;
import java.util.List;

class Gracz {
    private String imie;
    private List<Card> hand;
    private int sumaWartosci;


    public Gracz(String imie) {
        this.imie = imie;
        this.hand =  new ArrayList<>();
        this.sumaWartosci = 0;
    }

    public void dobierzKarte(Card card) {
        hand.add(card);
        sumaWartosci += card.getWartosc();
    }

    public boolean isBlackJack() {
        return sumaWartosci == 21;
    }

    public int getSumaWartosci() {
        return sumaWartosci;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void showHand() {
        System.out.println(imie + " ma karty:");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println("Suma wartosci kart: " + sumaWartosci);
    }

    public String getImie( ) {
        return imie;
    }
}