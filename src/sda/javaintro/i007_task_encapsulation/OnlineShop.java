package sda.javaintro.i007_task_encapsulation;

import sda.javaintro.i007_task_encapsulation.cart.CartManager;
import sda.javaintro.i007_task_encapsulation.cart.CartModel;
import sda.javaintro.i007_task_encapsulation.cart.ShopCart;
import sda.javaintro.i007_task_encapsulation.item.ItemManager;
import sda.javaintro.i007_task_encapsulation.item.ItemModel;
import sda.javaintro.i007_task_encapsulation.item.ItemUtil;
import sda.javaintro.i007_task_encapsulation.user.UserManager;
import sda.javaintro.i007_task_encapsulation.user.UserModel;

public class OnlineShop {
    public static void main(String[] args) {

        // User management
        UserManager userManager = new UserManager();
        UserModel user[] = new UserModel[10];
//        for (int i = 0; i < user.length; i++){
//            user[i] = new UserModel();
//        }

        userManager.createUser("Marcin", "Kobierowski", 34);
//        UserModel marcin = userManager.getUser();
//        System.out.println(marcin);
        user[0] = userManager.getUser();

        userManager.createUser("Łukasz", "Kowalski", 45);
        user[1] = userManager.getUser();

        System.out.println("List of user:");
        for (int i = 0; i < user.length; i++) {
            if (user[i] != null)
                System.out.println(user[i]);
        }

        // Item management
        ItemManager itemManager = new ItemManager();
        ItemModel item[] = new ItemModel[20];
//        for (int i = 0; i < item.length; i++) {
//            item[i] = new ItemModel();
//        }

        System.out.println("\nAdd item:");
        item[0] = itemManager.createShopItem("pralka", "pralka opis", 1399.99);
        item[1] = itemManager.createShopItem("monitor", "monitor opis", 600.45);
        item[2] = itemManager.createShopItem("waciki", "waciki opis", 9.30);
        item[3] = itemManager.createShopItem("papier", "papier opis", 2.30);

        //ItemUtil - truncate - cat string to maxLength char
        ItemUtil itemUtil = new ItemUtil();

        System.out.println("\nList of item (cut description to 10 char):");
        for (int i = 0; i < item.length; i++) {
            if (item[i] != null)
                System.out.println("- item " + (i + 1) + " itemTitle= " + item[i].getTitle() +
                        ", itemDescription= " + itemUtil.truncate(item[i].getDescription(), 10) +
                        ", item price= " + item[i].getPrice() + " PLN");
        }


        // Add to cart


        ShopCart shopCart = new ShopCart();

        System.out.println("\nAdd item to basket:");
        shopCart.addToBasket(1,2, item);
        shopCart.addToBasket(1,2, item);
        shopCart.addToBasket(2,2, item);
        shopCart.addToBasket(2,3, item);
        shopCart.addToBasket(3,3, item);
        shopCart.addToBasket(3,3, item);
        shopCart.addToBasket(4,3, item);
        shopCart.addToBasket(4,3, item);
        shopCart.addToBasket(5,3, item);
        shopCart.addToBasket(4,3, item);
        shopCart.addToBasket(7,3, item);
        shopCart.addToBasket(8,3, item);
        shopCart.addToBasket(10,3, item);
        shopCart.addToBasket(20,3, item);
        shopCart.addToBasket(21,3, item);


        System.out.println("\nYour item in basket:");
        shopCart.showItemInBasket(item);

        System.out.println("\nBuy:");
        shopCart.buy(item);

        System.out.println("\nYour item in basket:");
        shopCart.showItemInBasket(item);

/*
        // Add to cart (old solution)
        CartManager cartManager = new CartManager();
        CartModel cart[] = new CartModel[20];

        for (int i = 0; i < cart.length; i++) {
            cart[i] = new CartModel();
        }

        cart[0] = cartManager.addItemToCart(1, 1);
        cart[1] = cartManager.addItemToCart(2, 1);
        cart[2] = cartManager.addItemToCart(2, 1);
        cart[3] = cartManager.addItemToCart(3, 10);

        double basketPrice = cartManager.calculateBasket(cart, item);
        System.out.println("Total price of basket: " + basketPrice + " PLN");
*/

    }
}
