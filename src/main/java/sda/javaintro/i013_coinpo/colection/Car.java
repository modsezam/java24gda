package sda.javaintro.i013_coinpo.colection;

public class Car {
    private String brand;
    private Engine engine; // wkomponowana klasa `Engine`

    private Entertaiment entertaiment;

    public Car(String brand, Engine engine, Entertaiment entertaiment) { // konstruktor wymaga od nas podania obiektu typu Engine
        this.brand = brand;
        this.engine = engine;
        this.entertaiment = entertaiment;
    }

    public String getBrand() {
        return brand;
    }

    public void start() {

        engine.start(); // wywołanie metody na obiekcie `Engine`
        entertaiment.radioOn();
    }

    public void radioOn() {
        entertaiment.radioOn();
    }

    public void radioOff() {
        entertaiment.radioOff();
    }

    public void volumeUp() {
        entertaiment.volumeUp();
    }

    public EngineType getType() {
        return engine.getEngineType(); // wywołanie metody na obiekcie `Engine`
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
