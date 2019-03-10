package sda.javaintro.i013_coinpo.colection;

public class CompositionExample {
    public static void main(String[] args) {
        // deklaracja i inicjalizacja klasy Engine
        Engine engine = new Engine(2000, EngineType.PETROL);

        Entertaiment entertaiment = new Entertaiment();


        // deklaracja i incjalizacja klasy Car z podanym obiektem klasy Engine jako 2 argument
        Car car1 = new Car("Toyota", engine, entertaiment);

        System.out.println(car1); // wyświetlamy informacje o samochodzie (toString())

        // wyświetlamy typ silnika zastosowanego w samochodzie,
        // wewnętrznie wykonuje się metoda na obiekcie klasy Engine
        System.out.println("Car is: " + car1.getType());

        car1.start();

        Car car2 = new Car("Toyota", new Engine(3000, EngineType.DIESEL), entertaiment);
        System.out.println(car2);
        System.out.println("Car is: " + car2.getType());
    }
}
