package sda.javaintro.i007_task_encapsulation.user;

import sda.javaintro.i007_task_encapsulation.item.ItemModel;

public class UserManager {

    private UserModel user;

    public void createUser(String firstName, String lastName, int age) {
        user = new UserModel(firstName, lastName, age);
    }

    public UserModel getUser() {
        return user;
    }
}
