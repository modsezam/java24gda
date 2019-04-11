package sda.javaintro.i015_interfaces;

public class Mammals implements Animal, Swimmable{

    int age = 34;

    @Override
    public String getName() {
        return "Mammal name";
    }

    @Override
    public String speak() {
        return "Grrrr";
    }

    @Override
    public String swim() {
        return "Mammal swim";
    }

    @Override
    public int getAge() {
        return age;
    }
}
