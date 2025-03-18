
# CzarnyJacek Gra Karciana w Javie

## Opis projektu

Owy projekt jest implementacją popularnej gry karcianej **Blackjack** w języku Java. Celem gry jest osiągnięcie jak najbliższej wartości 21 punktów, nie przekraczając tej liczby, przy pomocy kart, które gracz i krupier otrzymują podczas rozgrywki.

**Gra odbywa się w terminalu.** 

**~In progress**
~~Gracz może wykonywać podstawowe akcje, takie jak dobieranie kart ("Hit") lub zatrzymywanie się ("Stand").~~

## Funkcjonalności

- Gra w trybie tekstowym, wyświetlająca karty gracza i krupiera.
- ~~Możliwość dobierania kart (Hit) lub kończenia tury (Stand).~~ **~In progress**
- Obliczanie wartości kart z uwzględnieniem zasad Blackjacka 
~~- (Asy mogą być liczone jako 1 lub 11).~~ **~In progress**
- Podstawowe zasady gry: gracz **nie może** przekroczyć **21 punktów**, jeśli to zrobi - **przegrywa**.
- Wyświetlanie komunikatów o wynikach każdej tury (**wygrałeś, przegrałeś, remis**).

## Jak uruchomić

1. Sklonuj repozytorium:
    ```bash
    git clone https://github.com/id-Scooutoo/CzarnyJacek.git
    ```

2. Zbuduj projekt:
    - Możesz użyć polecenia `javac` do skompilowania plików:
      ```bash
      javac *.java
      ```

3. Uruchom grę:
    - Uruchom grę przy użyciu polecenia `java`:
      ```bash
      java CzarnyJacek
      ```

## Struktura projektu

- `CzarnyJacek.java` - Główna klasa, zawierająca logikę gry.
- `Talia.java` - Klasa odpowiedzialna za talię kart.
- `Card.java` - Reprezentacja pojedynczej karty.
- `Gracz.java` - Klasa reprezentująca gracza.
- `Krupier.java` - Klasa reprezentująca krupiera.

## Wymagania

- Java 8 lub nowsza.

## Plany na przyszłość

- Dodanie GUI z użyciem biblioteki JavaFX.
- Możliwość gry z wieloma graczami online.
- Czat tekstowy dla graczy online.
- Implementacja bardziej zaawansowanych zasad (np. podział kart, podwajanie stawki).
- Możliwość ustawiania zakładów i zarządzania środkami gracza.

## Licencja

Projekt jest dostępny na licencji MIT. Zobacz plik [LICENSE](LICENSE) po więcej informacji.

## Kontakt

Olaf Skorowski  
E-mail: [skorowskiolaf@gmail.com](mailto:skorowskiolaf@gmail.com)  
GitHub: [https://github.com/id-Scooutoo](https://github.com/id-Scooutoo)

