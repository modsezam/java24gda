package sda.javaintro.i023_functional;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Tasks {

    public static void main(String[] args) {
        //#1
//        useLambdas();

        //#2
       // useOptional();

        //#3
        useStreams();
    }

    /**
     * 1. Utwórz i użyj lambdę która:
     * - utworzy obiekt klasy Double (Supplier)
     * - pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
     * - sprawdzi czy podany string ma długość > 10 (Predicate)
     * - przekształci dwie liczby w String (zsumuje je i zwróci reprezentację tekstową) (BiFunction)
     */
    private static void useLambdas() {

        Supplier<Double> doubleSupplier = () -> 10.2;
        System.out.println("doubleSupplier = " + doubleSupplier);

        Consumer<String>stringConsumer = s -> System.out.println("s = " + s);
        System.out.println("stringConsumer");
        stringConsumer.accept("Ala ma kota");

//        Predicate<String>stringPredicate = s -> {
//            if (s != null){
//                return s.length() > 10;
//            }
//            return false;
//        };

        Predicate<String>stringPredicate = s -> s != null && s.length() > 10;

        System.out.println(stringPredicate.test(null));
        System.out.println(stringPredicate.test("adb"));
        System.out.println(stringPredicate.test("adbdefghijklmnop"));

        BiFunction<Integer, Integer, String>integerIntegerStringBiFunction = (integer, integer2) -> String.valueOf(integer + integer2);
        System.out.println(integerIntegerStringBiFunction.apply(2, 4));

    }

    /**
     * 2. Utwórz obiekt Optional, który:
     * - nie będzie zawierał żadnej wartości (Optional.empty)
     * - będzie pozwalał przyjmować wartość typu String, która może być `null` (Optional.ofNullable)
     * - rzuci wyjątkiem, w momencie podania wartości null typu Float (Optional.of)
     * - rzuci własny wyjątek, jeśli podano wartość `null` i próbowano pobrać wartość (Optional.orElseThrow)
     * - zwróci wartość domyślną dla typu String jeśli podano wartość `null` (Optional.orElse)
     */
    private static void useOptional() {
//        Optional<String> optional = Optional.empty();
//        System.out.println("optional.ofNullable() = " + optional.ofNullable(null));
//        System.out.println("optional.of() = " + optional.of((float)0));
//        System.out.println("optional.of() = " + optional.orElseThrow();


    }


    /**
     * 3. Utwórz i użyj strumień danych (Stream):
     * - utwórz stream liczb typu Double z kolekcji typu Set - podaj ich sumę i średnią arytmetyczną
     * - utwórz stream liczb całkowitych od 10 do 40, usuń parzyste i podaj sumę pozostałych
     * - utwórz stream obiektów typu String, zamień wszystkie litery na małe, zostaw tylko te które zaczynają się na literę 'a' lub 'z'
     *   i utwórz listę przetworzonych elementów
     * - utwórz stream obiektów Person i utwórz statystykę lat (suma, średnia, minimalny i maksymalny wiek) dla tego zbioru
     * - utwórz strumień który wypisze na ekran ścieżki wszystkich katalogów i podkatalogów znajdujących się w aktualnym katalogu (Files.list && Paths.get("."))
     */
    private static void useStreams() {
        Set<Double> doubles = new HashSet<>();
        doubles.add(1.3);
        doubles.add(2.3);
        doubles.add(3.3);
        doubles.add(4.3);

        System.out.println(doubles.stream().mapToDouble(value -> value).sum());
        System.out.println(doubles.stream().mapToDouble(value -> value).average().getAsDouble());


        int sum = IntStream.range(10, 40).filter(value -> value % 2 != 0).sum();
        System.out.println(sum);


//        Stream<Double> stream1 = Double.ra

    }
}