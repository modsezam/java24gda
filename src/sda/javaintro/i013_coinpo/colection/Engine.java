package sda.javaintro.i013_coinpo.colection;

public class Engine {
    private boolean started = false;
    private int capacity;
    private EngineType engineType;

    public Engine(int capacity, EngineType engineType) {
        this.capacity = capacity;
        this.engineType = engineType;
    }

    public boolean getStarted() {
        return started;
    }

    public void start() {
        started = true;
        System.out.println("Engine is ON");
    }

    public int getCapacity() {
        return capacity;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "started=" + started +
                ", capacity=" + capacity +
                ", engineType=" + engineType +
                '}';
    }
}
