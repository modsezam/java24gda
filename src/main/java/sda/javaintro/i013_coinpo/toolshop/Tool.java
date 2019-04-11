package sda.javaintro.i013_coinpo.toolshop;

public abstract class Tool {

    private String model;
    private double price;

    public Tool(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail(){
        return "model: " + model + ", price: " + price;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
