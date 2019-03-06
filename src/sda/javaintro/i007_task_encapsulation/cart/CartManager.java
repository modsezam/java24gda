package sda.javaintro.i007_task_encapsulation.cart;

import sda.javaintro.i007_task_encapsulation.cart.CartModel;
import sda.javaintro.i007_task_encapsulation.item.ItemModel;

public class CartManager {

    //private CartModel nCartModel[];
    //private ItemModel nItemModel[];

    public CartModel addItemToCart(int itemNumber, int itemQuantity) {
        System.out.println("> Add item " + itemNumber + " to basket - item quantity " + itemQuantity);
        return new CartModel(itemNumber, itemQuantity);
    }

    public double calculateBasket(CartModel cartModel[], ItemModel itemModel[]) {
        double basketPrice = 0;
        int itemNumber;
        int itemQuantity;
        double itemPrice;

        for (int i = 0; i < cartModel.length; i++){
            itemNumber = cartModel[i].getItemBasketNumber();
            itemQuantity = cartModel[i].getItemBasketQuantity();
            if (itemNumber != 0){
                itemPrice = itemModel[(itemNumber - 1)].getPrice();
                basketPrice += itemQuantity * itemPrice;
                System.out.println("> Calculate item in basket: item " + itemNumber +
                        ", item quantity= " + itemQuantity +
                        ", item price= " + itemPrice + " PLN");
            }

        }



        return basketPrice;
    }
}


