package sda.oop;

/*
lesson 2
date 24.02.2019
content of task (in Polish):
5. * Utwórz nową klasę Temperature, która będzie posiadała pola: double temperature, String date, String hour.
Klasa określa temperaturę w skali Celsjusza w konkretnym dniu i o konkretnej godzinie. Dodaj konstruktor
inicjalizujący wszystkie trzy pola, metody-gettery dla każdego pola + dodaj metodę show() która będzie zwracała
napis w postaci: {date} {hour} - {temperature} °C, np: 2018-10-01 10:45 - 13 °C
6. * Dodaj do klasy Temperature metodę showInFahrenheit() która zwróci taki sam napis jak wyżej tylko w skali
Fahrenheit. Do konwersji temperatur użyj klasy FahrenheitConverter.

 */


public class Temperature {

    private double temperature;
    private String date;
    private String hour;
    private FahrenheitConverter tFahrenheitConverter;

    //konstruktor do


    public Temperature(FahrenheitConverter fahrenheitConverter, double temperature, String date, String hour) {
        this.tFahrenheitConverter = fahrenheitConverter;
        this.temperature = temperature;
        this.date = date;
        this.hour = hour;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public String show(){
        return (date + " " + hour + " - " + temperature + " °C");
    }

    public String showInFahrenheit(){
        return (date + " " + hour + " - " + tFahrenheitConverter.celsiusToFahrenheit(temperature) + " °F");

    }

}
