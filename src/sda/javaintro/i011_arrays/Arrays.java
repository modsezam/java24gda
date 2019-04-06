package sda.javaintro.i011_arrays;

/*

task (1-8) is done
task 9 in ship_game

1. Napisz metodę, która jako parametr przyjmuje zmienną typu String[] i wyświetla wszystkie elementy tablicy na
konsoli (użyj różnych rodzajów pętli).
2. Napisz metodę, która jako jedyny parametr przyjmuje zmienną typu int[] i zwróci sumę wszystkich elementów
tablicy.
3. Napisz metodę, która jako parametr przyjmuje parametr int count i w wyniku zwraca tablicę wypełnioną liczbami
parzystymi zaczynając od 2, tablica ma zawierać ilość liczb wskazanych przez parametr count.
4. Napisz metodę, która jako parametr przyjmuje tablicę typu float[] i w wyniku swojego działania powoduje
podwojenie wartości dla każdego indeksu przekazanej tablicy.
5. Napisz metodę, która jako parametr przyjmuje zmienną typu double[] i wyświetla na konsoli: pierwszy, środkowy
(jeden lub dwa środkowe) i ostatni element tablicy, a także średnią arytmetyczną wszystkich liczb z tabeli.
6. Napisz metodę, która jako parametr przyjmuje zmienną typu Car[] (klasę Car powinieneś mieć utworzoną w
ramach poprzednich zadań) i zwróci tablicę z odwróconą kolejnością elementów.
7. Przerób każdą z poprzednich metod (poza nr 3) tak żeby przyjmowała parametry jako varargs.
8. * Przerób metodę z zadania nr 2 tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][] i liczyła sumę z
wszystkich tablic.
9. * Napisz klasę, która pozwala tworzyć mapę gry w statki dla pojedynczego użytkownika. Mapa powinna być
tworzona na bazie dwuwymiarowej tablicy. Zadbaj o metody pozwalające tworzyć statki na mapie, a sam
konstruktor klasy powinien pozwalać na utworzenie planszy o zadanych wymiarach. Utwórz także przykład użycia.

 */


public class Arrays {


    public static void main(String[] args) {

        String[] array1;
        array1 = new String[]{"CollectionsTest", "test2", "test3"};

        int[] array2 = new int[]{1, 3, 5};

        int[] array3;

        float[] array4 = new float[]{(float) 2.4, (float) 3.5, (float) 4.5};

        double[] array5 = new double[]{3.1, 2.2, 4.3, 5.4, 7.5};
        double[] array5_2 = new double[]{3.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        double[] array5_3 = new double[]{};

        Car[] cars = new Car[]{
                new Car("brand1", "color1"),
                new Car("brand2", "color2"),
                new Car("brand3", "color3"),
                new Car("brand4", "color4"),
                new Car("brand5", "color5")
        };


        int[][] array8 = new int[][]{
                {1, 3, 5, 4},
                {1, 3, 5, 4},
                {1, 3, 5, 4}
        };

        // task i011_arrays 1
        System.out.println("\ntask 1:");
        writeTable(array1);

        // task i011_arrays 2
        System.out.println("\ntask 2:");
        System.out.println(sumIntArray(array2));
        System.out.println("Varargs:");
        System.out.println(sumIntArrayVarargs(3, 4, 5));


        // task i011_arrays 3
        System.out.println("\ntask 3:");
        array3 = enumNumbersToArray(3);

        for (int i : array3) {
            System.out.println(i);
        }

        // task i011_arrays 4
        System.out.println("\ntask 4:");
        array4 = doubleArray(array4);
        for (float v : array4) {
            System.out.println(v);
        }
        System.out.println("Varargs:");
        array4 = doubleArrayVarargs((float)4.5, (float)4);
        for (float v : array4) {
            System.out.println(v);
        }

        // task i011_arrays 5
        System.out.println("\ntask 5:");
        firstMiddleLast(array5);
        firstMiddleLast(array5_2);
        firstMiddleLast(array5_3);
        System.out.println("Varargs:");
        firstMiddleLastVarargs(4.1, 5.2, 6.3, 5.4);

        // task i011_arrays 6
        System.out.println("\ntask 6:");
        Car[] reverseCars = reverseArrayOfCars(cars);
        for (Car reverseCar : reverseCars) {
            System.out.println(reverseCar);
        }


        // task i011_arrays 8
        System.out.println("\ntask 8:");
        System.out.println(sumDoubleIntArray(array8));




    }


    // method to i011_arrays 1
    private static void writeTable(String... array) {

        for (String s : array) {
            System.out.println(s);
        }

    }

    // method to i011_arrays 2
    private static int sumIntArray(int[] array) {

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    private static int sumIntArrayVarargs(int ... ints){
        return sumIntArray(ints);
    }

    // method to i011_arrays 3
    private static int[] enumNumbersToArray(int sizeOfArray) {
        int[] result = new int[sizeOfArray];
        result[0] = 2;

        for (int i = 1; i < sizeOfArray; i++) {
            result[i] = result[i - 1] + 2;
        }

        return result;
    }

    // method to i011_arrays 4
    private static float[] doubleArray(float array[]) {

        for (int i = 0; i < array.length; i++) {
            array[i] *= (float) 2;
        }
        return array;
    }

    private static float[] doubleArrayVarargs (float ... floats){
        return doubleArray(floats);
    }


    // method to i011_arrays 5
    private static void firstMiddleLast(double array[]) {
        if (array.length == 0) {
            System.out.println("Array is empty!");
        } else if (array.length == 1) {
            System.out.println("The first middle and last element is: " + array[0]);
        } else if (array.length == 2) {
            System.out.println("The first element is: " + array[0]);
            System.out.println("The middle element is: " + array[0] + " and " + array[1]);
            System.out.println("The last element is: " + array[1]);
        } else if (array.length % 2 == 1) {

            System.out.println("The first element is: " + array[0]);
            System.out.println("The middle element is: " + array[(array.length / 2)]);
            System.out.println("The last element is: " + array[array.length - 1]);

        } else if (array.length % 2 == 0) {
            System.out.println("The first element is: " + array[0]);
            System.out.println("The middle element is: " + array[(array.length/2) - 1] + " and " + array[array.length/2]);
            System.out.println("The last element is: " + array[array.length - 1]);
        }
    }

    private static void firstMiddleLastVarargs(double ... doubles){
        firstMiddleLast(doubles);
    }

    // method to i011_arrays 6
    private static Car[] reverseArrayOfCars(Car[] cars){
        Car[] result = new Car[cars.length];

        for (int i = 0; i < cars.length; i++) {
            result[i] = cars[cars.length - 1 - i];
        }

        return result;
    }

    // method to i011_arrays 8
    private static int sumDoubleIntArray(int[][] array) {

        int result = 0;

        for (int[] ints : array) {
            result += sumIntArray(ints);
        }

        return result;
    }



}



