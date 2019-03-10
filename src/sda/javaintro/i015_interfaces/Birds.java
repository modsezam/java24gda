package sda.javaintro.i015_interfaces;

public class Birds implements Animal, Flyable {

    public int age = 23;


    @Override
    public String getName() {
        return "Bird name";
    }

    @Override
    public String speak() {
        return "Grgrgrrr";
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
