import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CzarnyJacek {
    public static void main(String[] args) {

        Talia talia = new Talia();
        System.out.println("Talia utworzona i potasowana!");

        Gracz gracz = new Gracz("Gracz");
        Krupier krupier = new Krupier();

        gracz.dobierzKarte(talia.dobierzKarte());
        krupier.dobierzKarte(talia.dobierzKarte());
        gracz.dobierzKarte(talia.dobierzKarte());
        krupier.dobierzKarte(talia.dobierzKarte());

        gracz.showHand();
        krupier.showHand();

        krupier.tasujKarty(talia);
        krupier.showHand();



        System.out.println("Pozostało kart w talii: " + talia.ileKart());


        wynik(gracz, krupier);
    }




    public static void wynik(Gracz gracz, Krupier krupier) {
        if (gracz.getSumaWartosci() > 21) {
            System.out.println(gracz.getImie() + " przekroczyl 21. Krupier wygrywa!");
        } else if (krupier.getSumaWartosci() > 21) {
            System.out.println("Krupier przekroczyl 21. " + gracz.getImie() + " wygrywa!");
        } else if (gracz.getSumaWartosci() > krupier.getSumaWartosci() ) {
            System.out.println(gracz.getImie() + " wygrywa z wartoscia " + gracz.getSumaWartosci() + "!");
        } else if (krupier.getSumaWartosci() > gracz.getSumaWartosci()) {
            System.out.println("Krupier wygrywa z wartoscia " + krupier.getSumaWartosci() + "!");
        }else {
            System.out.println("Remis! Obaj maja rowna wartosc kart!");
        }
    }

}
