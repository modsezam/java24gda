public class FahrenheitConverter {

    public static void main(String[] args) {


        System.out.println(">>> Task 7 - #datatypes");

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
