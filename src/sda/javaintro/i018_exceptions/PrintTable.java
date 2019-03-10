package sda.javaintro.i018_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {

            int index = scanner.nextInt();
            String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
            System.out.println(fruits[index]);
        }
        catch (InputMismatchException ime){
            System.out.println("error - not index " + ime);
        }
        catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("error index exceeded " + aioobe);
        }
        finally {
            System.out.println("finally text");
        }
    }
}
