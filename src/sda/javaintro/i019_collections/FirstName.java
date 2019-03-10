package sda.javaintro.i019_collections;

/*

4. Napisz metodę, która będzie przyjmować imiona od użytkownika, a wprowadzenie znaku "q"
przerwie swoje działanie i wyświetli wszystkie unikalne imiona dodane do kolekcji.

 */


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> firstNameList = new HashSet<>();

        while (true) {
            System.out.print("Type the next name:\n>>> ");
            String input = scanner.nextLine();

            if (anyCharIsNumeric(input)) {
                System.out.println("This expression is not a name! (there is a number)");
            } else if ("q".equalsIgnoreCase(input)) {
                System.out.println("\nAll entered name list: (number of positions is " + firstNameList.size() + ")");
                for (String fnl : firstNameList) {
                    System.out.println("- " + fnl);
                }
                break;
            } else if (input.length() < 2) {
                System.out.println("This expression is not a name! (the name mast by longer than '1' letter)");
            } else if (input.charAt(0) != input.toUpperCase().charAt(0) || !Character.isLetter(input.charAt(0))) {
                System.out.println("This expression is not a name! (the name must start with a upper letter)");
            } else {
                firstNameList.add(input);
            }

        }
    }

    private static boolean anyCharIsNumeric(String string) {
        boolean isNumeric = false;
        try {
            for (int i = 0; i < string.length(); i++) {
                boolean a = Character.isDigit(string.charAt(i));
                if (a) {
                    isNumeric = true;
                }
            }
        } catch (NumberFormatException | NullPointerException e) {
        }
        return isNumeric;

    }


}