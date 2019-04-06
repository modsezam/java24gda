package sda.test.interfaces;

abstract class FlyableAnimal extends AnimalClass implements Flyable {
    boolean fly;

    public FlyableAnimal(String name, String speak, int age, boolean fly) {
        super(name, speak, age);
        this.fly = fly;
    }

    @Override
    public boolean isFlying(){
        fly=true;
        return fly;
    }

    @Override
    public boolean isNotFlying() {
        fly = false;
        return fly;
    }
}
