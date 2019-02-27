package sda.oop;


public class TemperatureApp {



    public static void main(String[] args) {

        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        Temperature temp = new Temperature(fahrenheitConverter, 23, "10.12.2019", "12:43");



        System.out.println(temp.show());
        System.out.println(temp.showInFahrenheit());
    }
}
