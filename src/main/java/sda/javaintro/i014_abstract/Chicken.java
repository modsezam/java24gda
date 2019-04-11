package sda.javaintro.i014_abstract;

public class Chicken extends Meat {

    public Chicken(String name) {
        super(name);
    }

    @Override
    public void getTaste() {
        System.out.println("Taste chicken is good");
    }

    @Override
    public String getType() {
        return null;
    }
}
