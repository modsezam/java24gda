package sda.javaintro.i013_coinpo.toolshop;

public class Saw extends Tool {

    private int length;

    public Saw(String model, double price, int length) {
        super(model, price);
        this.length = length;
    }

    @Override
    public String getDetail(){
        return super.getDetail() + ", length: " + length;
    }
}
