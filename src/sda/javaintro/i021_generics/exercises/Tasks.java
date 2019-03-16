package sda.javaintro.i021_generics.exercises;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
////        #1
        Set<Double> doubles = setOfDoubles();

        doubles.add(2.2);
        doubles.add(3.2);
        doubles.add(4.2);

        for (Double aDouble : doubles) {
            System.out.println("aDouble" + aDouble);
        }



        doubles.getClass();
//
////        #2
////        Map<Integer, String> genericMap = genericMap();
//
//        //#3
        List<Number> numbers = doublesToNumbers(doubles);
        System.out.println("numbers = " + numbers);

        //#4
        NumbersBox numbersBox = numbersToNumbersBox(numbers);

       //numbersBox.isEmpty();

        //#5
        //NumbersBox<Double> doubleNumbersBox = boxOfDoubles(doubles);
    }

    /**
     * 1. Stwórz kolekcję typu Set, zawierającą obiekty klasy Double. Dodaj do niej kilka liczb.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy kolekcji.
     * Metoda powinna zwrócić stworzoną kolekcję.
     */
    private static Set<Double> setOfDoubles() {
        Set<Double> doubleSet = new HashSet<>();

        return doubleSet;
    }



    /**
     * 2. Stwórz mapę zawierającą obiekty typu Integer jako klucze i String jako wartości. Dodaj kilka obiektów do mapy.
     * Pobierz i wyświetl w konsoli pojedyncze elementy.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy mapy.
     * Metoda powinna zwrócić stworzoną mapę.
     */
    private static Map<Integer, String> genericMap() {

        Map<Integer, String> sampleMap = new HashMap<>();
        sampleMap.put(1, "one");
        sampleMap.put(2, "two");
        sampleMap.put(3, "three");

        for (Integer key : sampleMap.keySet()) {
            System.out.println("key: " + key + " - " + sampleMap.get(key));
        }

        return sampleMap;
    }

    /**
     * 3. Skopiuj podany zbiór liczby Double do listy obiektów klasy Number.
     * Nie kopiuj obiektu jeżeli jest równy null.
     * Zwróć nową listę jako wynik metody.
     */
    private static List<Number> doublesToNumbers(Set<Double> doubles) {
        List<Number> list = new ArrayList<>();
        for (Double aDouble : doubles){
            list.add(aDouble);

        }

        return list;

    }

    /**
     * 4. Uzupełnij klasę NumbersBox która ma przechowywać listę obiektów klasy Number.
     * Dodaj metody które:
     * - sprawdzą czy lista jest pusta
     * - pobierze pierwszy element listy
     * - pobierze pierwszy element listy jako int
     * - pobierze ostatni element listy
     * - pobierze ostatni element listy jako int
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox numbersToNumbersBox(List<Number> numbers) {
        NumbersBox<Number> numbersBox = new NumbersBox<>();
        //System.out.println(numbersBox.isEmpty());
        return numbersBox;
    }

    /**
     * 5. Zmień klasę NumbersBox - tak żeby przyjmowała różne typy liczbowe - np. Double
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox<Double> boxOfDoubles(Set<Double> doubles) {
        return null;
    }
}
