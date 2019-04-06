package sda.test.interfaces;

abstract class SwimmableAnimal extends AnimalClass implements Swimmable{
    boolean swim;

    public SwimmableAnimal(String name, String speak, int age, boolean swim) {
        super(name, speak, age);
        this.swim = swim;
    }

    @Override
    public boolean isSwimming() {
        swim = true;
        return swim;
    }

    @Override
    public boolean isNotSwimming() {
        swim = false;
        return swim;
    }
}
