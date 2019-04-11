package sda.javaintro.i007_task_encapsulation.cart;

import sda.javaintro.i007_task_encapsulation.item.ItemModel;

public class ShopCart {

    private static int index;
    private double totalCost = 0.0;
    private final int TAB_SIZE = 10;

    private String[] basketTitle = new String[TAB_SIZE];
    private int[] basketQuantity = new int[TAB_SIZE];
    private double[] itemPrice = new double[TAB_SIZE];

    public void addToBasket(ItemModel itemModel, int itemQuantity) {

        if (index < TAB_SIZE) {
            basketTitle[index] = itemModel.getTitle();
            basketQuantity[index] = itemQuantity;
            itemPrice[index] = itemModel.getPrice();
            System.out.printf("log> Add item %d to basket%n", index + 1);
        } else {
            System.out.println("log> Basket is full!");
        }


        index += 1;
    }

    public void showItemInBasket() {
        totalCost = 0.0;
        for (int i = 0; i < TAB_SIZE; i++) {
            if (basketTitle[i] != null) {

                System.out.printf("- %s; %d pcs.; Summary price: %.2f PLN%n",
                        basketTitle[i], basketQuantity[i], itemPrice[i] * basketQuantity[i]);
                totalCost += itemPrice[i] * basketQuantity[i];
            }
        }
        System.out.printf("The total cost of products from the basket: %.2f PLN%n", totalCost);
    }

    public void buy() {

        showItemInBasket();
        System.out.printf("You bought all the products from the basket for %.2f PLN%n", totalCost);
        for (int i = 0; i < TAB_SIZE; i++) {
            basketTitle[i] = null;
            basketQuantity[i] = 0;
            itemPrice[i] = 0.0;
        }
        System.out.println("\nlog> The basket is empty.");
    }


}
