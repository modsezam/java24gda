package sda.javaintro.i007_task_encapsulation.item;


public class ItemManager {

    public ItemModel createShopItem(String title, String description, double price) {
        System.out.println("> Add item: " + title + ", decryption: " + description + ", price: " + price + " PLN");
        return new ItemModel(title, description, price);
    }




}
