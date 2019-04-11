package sda.javaintro.i015_interfaces;

public class Fish implements Animal, Swimmable {

    int age = 23;

    @Override
    public String getName() {
        return "Fish name";
    }

    @Override
    public String speak() {
        return "Dsadas";
    }

    @Override
    public String swim() {
        return "Swim";
    }

    @Override
    public int getAge() {
        return age;
    }
}
