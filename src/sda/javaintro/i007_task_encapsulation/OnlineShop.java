package sda.javaintro.i007_task_encapsulation;

import sda.javaintro.i007_task_encapsulation.item.ItemManager;
import sda.javaintro.i007_task_encapsulation.user.UserManager;

public class OnlineShop {
    public static void main(String[] args) {
        // TODO
        ItemManager itemManager = new ItemManager();
        UserManager userManager = new UserManager();

        userManager.createUser("Marcin", "Kobierowski", 34);
        System.out.println(userManager.getUser());


    }
}
