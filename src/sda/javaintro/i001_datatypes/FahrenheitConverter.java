package sda.javaintro.i001_datatypes;

/*
lesson 1
date 23.02.2019
content of i007_task_encapsulation (in Polish):

7. W osobnej klasie FahrenheitConverter, w metodzie main() napisz program przekształcający dane o temperaturze
podanej w skali Fahrenheit do skali Celsjusza. Dane wejściowe (temperatura w skali Fahrenheit) podać w inicjacji
odpowiedniej zmiennej w programie. Sprawdź czy program poprawnie oblicza temperatury dla danych:
32 °F = 0 °C; 212 °F = 100 °C

lesson 2
date 24.02.2019
content of i007_task_encapsulation (in Polish):
2. Przenieś kod zapisany w metodach main() klas FahrenheitConverter i ComputerPrice do osobnych metod, np.:
convertToCelsius(double temperatureInFahrenheit), getComputerPrice()
3. W klasie FahrenheitConverter dodaj metodę, która konwertuje temperatury w drugą stronę (Celsjusz →
Fahrenheit)

 */


public class FahrenheitConverter {

    public static void main(String[] args) {


        System.out.println(">>> Task 7 - #i001_datatypes");

        double fahrenheit1 = 212;
        System.out.println(fahrenheit1 + " st F = (st C) " + fahrenheitToCelsius(fahrenheit1));

        double fahrenheit2 = 32;
        System.out.println(fahrenheit2 + " st F = (st C) " + fahrenheitToCelsius(fahrenheit2));

        double celsius1 = 100;
        System.out.println(celsius1 + " st C = (st F) " + celsiusToFahrenheit(celsius1));

        double celsius2 = 0;
        System.out.println(celsius2 + " st C = (st F) " + celsiusToFahrenheit(celsius2));

        //System.out.println("58 st F = (st C) " + fahrenheitToCelsius(58.0));
        //System.out.println("58 st F = (st C) " + fahrenheitToCelsius(58));

    }

    private static double fahrenheitToCelsius (double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }
    private static double celsiusToFahrenheit (double celsius) { return (celsius * 1.8 + 32); }




}
