package sda.javaintro.i007_task_encapsulation;

import sda.javaintro.i007_task_encapsulation.item.ItemManager;
import sda.javaintro.i007_task_encapsulation.user.UserManager;
import sda.javaintro.i007_task_encapsulation.user.UserModel;

public class OnlineShop {
    public static void main(String[] args) {
        // TODO
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

//        System.out.println(user[0]);
//        System.out.println(user[1]);

        System.out.println("List of user:");
        for (int i = 0; i < user.length; i++){
            System.out.println(user[i]);
        }



    }
}
