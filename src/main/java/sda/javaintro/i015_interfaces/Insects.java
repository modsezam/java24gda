package sda.javaintro.i015_interfaces;

public class Insects implements Animal, Flyable {

    int age = 45;

    @Override
    public String getName() {
        return "insect name";
    }

    @Override
    public String speak() {
        return "dasad";
    }

    @Override
    public String fly() {
        return "fly";
    }

    @Override
    public int getAge() {
        return age;
    }
}
