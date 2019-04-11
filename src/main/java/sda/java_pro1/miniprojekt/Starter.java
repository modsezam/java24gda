package sda.java_pro1.miniprojekt;

public class Starter {
    public static void main(String[] args) {
        BooksManager booksManager = new BooksManager();
        ManagerGui managerGui = new ManagerGui(booksManager);
        managerGui.runIt();
        System.exit(0);
    }
}