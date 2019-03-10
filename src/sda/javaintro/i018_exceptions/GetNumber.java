package sda.javaintro.i018_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException ime){
            System.out.println("eror: " + ime);
        }
        finally {
            System.out.println("finally test");
        }
    }
}
