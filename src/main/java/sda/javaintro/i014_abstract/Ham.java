package sda.javaintro.i014_abstract;

public class Ham extends Meat {

    public Ham(String name) {
        super(name);
    }

    @Override
    public void getTaste() {
        System.out.println("Taste ham is good");
    }

    @Override
    public String getType() {
        return null;
    }
}
