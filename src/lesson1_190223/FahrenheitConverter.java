public class FahrenheitConverter {

    public static void main(String[] args) {


        System.out.println(">>> Task 7 - #datatypes");

        double fahrenheit1 = 212;
        System.out.println(fahrenheit1 + " st F = (st C) " + fahrenheitToCelsius(fahrenheit1));

        double fahrenheit2 = 32;
        System.out.println(fahrenheit2 + " st F = (st C) " + fahrenheitToCelsius(fahrenheit2));

        //System.out.println("58 st F = (st C) " + fahrenheitToCelsius(58.0));
        //System.out.println("58 st F = (st C) " + fahrenheitToCelsius(58));

    }

    private static double fahrenheitToCelsius (double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }




}
