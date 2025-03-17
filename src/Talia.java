import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

    class Talia {
    private List<Card> karty;

    public Talia() {
        karty = new ArrayList<>();
        initTalia();
        tasuj();
    }

    private void initTalia() {
        String[] kolory = {"Pik", "Kier", "Karo", "Trefl"};
        String[] figury = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Walet", "Dama", "Król"};
        int[] wartosci = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        for (String kolor : kolory) {
            for (int i = 0; i < figury.length; i++) {
                karty.add(new Card(figury[i] + " " + kolor, wartosci[i]));
            }
        }
    }

    public void tasuj() {
        Collections.shuffle(karty);
    }

    public Card dobierzKarte() {
        if (karty.isEmpty()) {
            throw  new IllegalStateException("Talia jest pusta!");
        }
        return karty.remove(0);
    }

    public int ileKart() {
        return karty.size();
    }
}
