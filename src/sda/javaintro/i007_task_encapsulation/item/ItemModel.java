package sda.javaintro.i007_task_encapsulation.item;

public class ItemModel {
    private String title;
    private String description;
    private double price;

    protected ItemModel(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public  ItemModel (){}

    public String getTitle() {

        return title;
    }

    public String getDescription() {

        return description;
    }

    public double getPrice() {

        return price;
    }

}
