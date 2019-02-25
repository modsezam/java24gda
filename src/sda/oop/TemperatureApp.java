package sda.oop;

public class TemperatureApp {



    public static void main(String[] args) {

        Temperature t = new Temperature(23, "10.12.2019", "12:43");

        System.out.println(t.show());
        System.out.println(t.showInFahrenheit());
    }
}
