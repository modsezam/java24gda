package sda.javaintro.i003_oop;

/*

lesson 2
date 24.02.2019
content of i007_task_encapsulation (in Polish):

>   1. Utwórz klasę Car z polami: brand i color
    {na katalogu}(Alt + Insert → Java Class lub PPM → New → Java Class)
>   2. Dodaj konstruktor i oba pola jako argumenty
    {w klasie}(Alt + Insert → Constructor lub PPM → Generate → Constructor)
>   3. Dodaj metodę toString() i dodaj oba pola
    {w klasie}(Alt + Insert → toString() lub PPM → Generate → toString())
    4. W klasie HelloWorldApp utwórz nowy obiekt na podstawie klasy Car, np.
    Car toyota = new Car("Toyota", "black");
    5. Wypisz na konsoli informację o samochodzie
    System.out.println("My car is: " + toyota);
    6. Uruchom program
    {w klasie}(Alt + Shift + F10 lub PPM → Run Car.main())


 */

public class Car {
    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "sda.javaintro.i003_oop.Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
