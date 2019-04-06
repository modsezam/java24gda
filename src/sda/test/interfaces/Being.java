package sda.test.interfaces;

public interface Being {
    int MAX_AGE=100;


    String getName();

    int getAge();

    default boolean isAlive(){
        return getAge() < MAX_AGE;
    }

}
