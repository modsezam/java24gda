package sda.oop;

/*

lesson 2
date 24.02.2019
content of task (in Polish):

    1. Utwórz klasę Car z polami: brand i color
    {na katalogu}(Alt + Insert → Java Class lub PPM → New → Java Class)
    2. Dodaj konstruktor i oba pola jako argumenty
    {w klasie}(Alt + Insert → Constructor lub PPM → Generate → Constructor)
    3. Dodaj metodę toString() i dodaj oba pola
    {w klasie}(Alt + Insert → toString() lub PPM → Generate → toString())
>   4. W klasie HelloWorldApp utwórz nowy obiekt na podstawie klasy Car, np.
    Car toyota = new Car("Toyota", "black");
>   5. Wypisz na konsoli informację o samochodzie
    System.out.println("My car is: " + toyota);
>   6. Uruchom program
    {w klasie}(Alt + Shift + F10 lub PPM → Run Car.main())


 */

public class HelloWorlsApp {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota", "black");
        System.out.println("My car is: " + toyota);

        Car mercedes = new Car("Mercedes", "red");
        System.out.println("My car is: " + mercedes);

    }
}
