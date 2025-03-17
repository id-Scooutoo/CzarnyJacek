import java.util.*;

public class Krupier {
    private List<Card> hand;
    private int sumaWartosci;

    public Krupier() {
        this.hand = new ArrayList<>();
        this.sumaWartosci = 0;
    }

    public void dobierzKarte(Card card) {
        hand.add(card);
        sumaWartosci += card.getWartosc();
    }

    public void tasujKarty(Talia talia) {
        while (sumaWartosci < 17) {
            dobierzKarte((talia.dobierzKarte()));
        }
    }

    public int getSumaWartosci() {
        return  sumaWartosci;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void showHand() {
        System.out.println("Karty krupiera:");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println("Suma wartosci kart: " + sumaWartosci);
    }
}
