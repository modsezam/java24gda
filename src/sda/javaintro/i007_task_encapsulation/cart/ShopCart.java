package sda.javaintro.i007_task_encapsulation.cart;

import sda.javaintro.i007_task_encapsulation.item.ItemModel;

public class ShopCart {

    private int[][] basket = new int[10][2];

    public void addToBasket(int itemIndex, int itemQuantity, ItemModel itemModel[]) {
        for (int i = 0; i < basket.length; i++) {
            //checking if the itemIndex is not exceeded
            if (itemIndex > itemModel.length){
                System.out.println("> The index " + itemIndex + " of item is exceeded!");
                return;
            }
            else if (itemIndex <= itemModel.length && itemModel[itemIndex - 1] == null){
                System.out.println("> The index " + itemIndex + " of item is exceeded!");
                return;
            }
            //checking if the item is in the basket
            else if (basket[i][0] == itemIndex) {
                basket[i][1] += itemQuantity;
                System.out.println("> Item " + itemIndex + " is in basket. Add quantity " +
                        itemQuantity + " to " + basket[i][1]);
                return;
            }
            //checking next free slot in the basket
            else if (basket[i][0] == 0){
                basket[i][0] = itemIndex;
                basket[i][1] = itemQuantity;
                System.out.println("> Add item " + itemIndex + " to basket. Set quantity to " + itemQuantity);
                return;
            }
            else if (i == (basket.length - 1)){
                System.out.println("Basket is full!");
                return;
            }
        }
    }

    public void showItemInBasket(ItemModel itemModel[]){

        for (int i = 0; i < basket.length; i++){
            if (basket[0][0] == 0){
                System.out.println("Your basket is empty!");
                return;
            }
            else if (basket[i][0] != 0 && basket[i][0] < itemModel.length && itemModel[(basket[i][0] - 1)] != null){
                System.out.println("item: " + itemModel[basket[i][0] - 1].getTitle() +
                        ", quantity: " + basket[i][1] +
                        ", sum price: " + (itemModel[i].getPrice() * basket[i][1]) + " PLN");
            }
        }
    }

    public void buy(ItemModel itemModel[]){

        double sumPrice = 0.0;
        for (int i = 0; i < basket.length; i++){
            if (basket[i][0] != 0 && basket[i][0] < itemModel.length && itemModel[(basket[i][0] - 1)] != null){
                sumPrice += (itemModel[i].getPrice() * basket[i][1]);
                System.out.println("item: " + itemModel[basket[i][0] - 1].getTitle() +
                        ", quantity: " + basket[i][1] +
                        ", sum price: " + (itemModel[i].getPrice() * basket[i][1]) + " PLN");
            }
        }
        System.out.println("Summary price for purchase: " + sumPrice + " PLN");
        for (int i = 0; i < basket.length; i++)
            for (int j = 0; j < 2; j++){
                basket[i][j] = 0;
            }
        System.out.println("You buy all item for " + sumPrice + " PLN. Shop card is empty now!");



    }


}
