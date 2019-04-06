package sda.javaintro.i009_loops;

/*

(task 1 - 6 is done)
1. Napisz metodę, która wyświetli na ekranie n-pierwszych liczb parzystych. Zmienna n to parametr metody. Czyli np. dla n = 4 program
powinien wypisać: 2, 4, 6, 8
2. Napisz metodę, która policzy n-tą potęgę (n >= 0) liczby całkowitej a. Parametry metody to: n i a.
3. Wypisz na ekran co drugą, dużą literę alfabetu łacińskiego, zaczynając od 'A' i kończąc na 'Z'. Użyj pętli for, a potem spróbuj przerobić
program używając pętli while.
4. Napisz metodę która sprawdzi czy dwa podane Stringi (zmienne typu String) są takie same - bez użycia metody equals().
Podpowiedź: możesz porównać oba teksty znak po znaku używając jednej z metod klasy String.
5. Napisz metodę sprawdzającą ilość wystąpień frazy: phrase w tekście: text. Parametry metody to: phrase i text.
Podpowiedź: użyj metody klasy String która sprawdza index dla podanej frazy
6. Zmień metodę pl.sda.loops.ForLoop.sumNumbersFromUser() tak by przyjmowała liczby typu float. W podsumowaniu oprócz sumy
wypisz także średnią arytmetyczną podanych liczb.

7. * Napisz metodę która wyświetli na ekranie prostokąt o podanych rozmiarach: width i height (to są parametry metody).
Podpowiedź: zobacz metodę: pl.sda.loops.ForLoop.leftTriangle()
8. * Utwórz program który będzie pobierał od użytkownika liczby typu float aż do momentu osiągnięcia limitu podanego jako parametr
metody. Na koniec wypisz ile było tych liczb, jaka była ich suma (z częścią ułamkową) i jaka jest ich średnia arytmetyczna.
9. * Napisz metodę sprawdzającą, czy dany łańcuch znaków jest palindromem.

 */

public class Loops {

    public static void main(String[] args) {

        // task 1
        evenNumber(10);

        // task 2
        nPower(0, 2);

        // task 3
        latinAlphabetFor();

        // task 4
        System.out.println(compareStrings("Marcin", "Marcin"));
        System.out.println(compareStrings("Marcin", "Marci"));

        // task 5
        System.out.println(numberOfRepetitions("Mar_cin_cin_cin", "cin"));

        // task 6

    }

    private static void evenNumber(int n) {


        int i = 2;
        int numberOfOccurrences = 0;
        while (numberOfOccurrences < n) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
                numberOfOccurrences++;
            }
            i++;
        }
        System.out.print("\n");
    }

    private static void nPower(int n, int a) {
        int b = a;
        if (n < 0) {
            System.out.println("error!");
        } else if (n == 0) {
            b = 1;
        } else if (n > 0) {
            for (int i = 1; i < n; i++) {
                b *= a;
            }

        }
        System.out.println(b);
    }

    private static void latinAlphabetFor() {

        char a = 'A';
        char z = 'Z';

        for (int i = a; i < z; i++) {
            System.out.print((char) i);
            i++;
        }
        System.out.print("\n");
    }

    private static boolean compareStrings(String text1, String text2) {

        int count1 = text1.length();
        int count2 = text2.length();
        int countChar = 0;

        if (count1 == count2) {
            for (int i = 0; i < count1; i++) {
                if (text1.charAt(i) == text2.charAt(i)) {
                    countChar++;
                }
            }
        } else return false;

        return countChar == text1.length();
    }

    private static int numberOfRepetitions(String text, String phrase) {

        int count = 0;
        int lastIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if (count == 0 && text.indexOf(phrase, i) == -1){
                return 0;
            }
            if (text.indexOf(phrase, i) > lastIndex){
                count++;
                lastIndex = text.indexOf(phrase, i);
            }

        }
    return count;
    }

}
