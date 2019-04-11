package sda.javaintro.i021_generics.exercises;

/**
 * Generyczna wersja klasy Box. <T> oznacza typ wartości przechowywanej w klasie GenericBox
 */
public class GenericBox<T> {
    // T to skrót od "Type"
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
