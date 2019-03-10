package sda.javaintro.i014_abstract;

public class Carrot extends Vegetable{


    public Carrot(String name) {
        super(name);
    }

    @Override
    public void getTaste() {
        System.out.println("Taste carrot is good");
    }

    @Override
    public String getType() {
        return null;
    }
}
