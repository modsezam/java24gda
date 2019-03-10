package sda.javaintro.i015_interfaces;

public class Reptiles implements Animal, Swimmable {

    int age = 23;

    @Override
    public String getName() {
        return "Reptiles name";
    }

    @Override
    public String speak() {
        return "Raeresar";
    }

    @Override
    public String swim() {
        return "Reptiles swim ";
    }

    @Override
    public int getAge() {
        return age;
    }
}
