package sda.javaintro.i013_coinpo.toolshop;

public class Hammer extends Tool {

    private double weight;

    public Hammer(String model, double price, double weight) {
        super(model, price);
        this.weight = weight;
    }

    @Override
    public String getDetail(){
        return super.getDetail() + ", weight: " + weight;
    }
}
