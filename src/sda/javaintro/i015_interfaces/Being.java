package sda.javaintro.i015_interfaces;

public interface Being {

    int getAge();
    int MAX_AGE = 100;

    default boolean isAlive() {
        if (this.getAge() < MAX_AGE) {
            return true;
        }
        return false;
    }

}
