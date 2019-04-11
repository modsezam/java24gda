package sda.javaintro.i014_abstract;

public class Salad extends Vegetable{

    public Salad(String name) {
        super(name);
    }

    @Override
    public void getTaste() {
        System.out.println("Taste salad is good");
    }

    @Override
    public String getType() {
        return null;
    }
}
