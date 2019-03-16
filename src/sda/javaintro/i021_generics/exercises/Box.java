package sda.javaintro.i021_generics.exercises;

public class Box {
    private Object object;

    public Box(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }

    public boolean isEmpty() {
        return object != null;
    }
}