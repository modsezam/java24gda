package spoj;

import java.util.Scanner;
import java.lang.*;

public class Number42 {

    public static void main(String[] args) throws java.lang.Exception {


        Scanner scanner = new Scanner(System.in);
        int numberOfPrime;

        while (true){
            numberOfPrime = scanner.nextInt();
            if (numberOfPrime == 42){
                break;
            }
            System.out.println(numberOfPrime);
        }



    }
}
