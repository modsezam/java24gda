package spoj;/*
https://pl.spoj.com/problems/PRIME_T/

PRIME_T - Liczby Pierwsze
Sprawdź, które spośród danych liczb są liczbami pierwszymi

Input
n - liczba testów n<100000, w kolejnych liniach n liczb z przedziału [1..10000]

Output
Dla każdej liczby słowo TAK, jeśli liczba ta jest pierwsza, słowo: NIE, w przeciwnym wypadku.

Example
Input:
3
11
1
4

Output:
TAK
NIE
NIE
 */

//import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

public class PrimeTApp {
//throws java.lang.Exception
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        int numberOfPrime = scanner.nextInt();
        String state;

        boolean[] primeList = new boolean[numberOfPrime];

        for (int i = 0; i < numberOfPrime; i++){


            int number = scanner.nextInt();

            primeList[i] = isPrime(number);

        }for (int i = 0; i < numberOfPrime; i++){

            if (primeList[i] == false)
                System.out.println("NIE");
            else
                System.out.println("TAK");
        }






    }

    public static boolean isPrime(int number){
        if (number <=1 )
            return  false;
        else{
            for (int i = 2; i*i <= number; i++){
                if (number %  i == 0){
                    return  false;
                }
            }
            return true;
        }



    }


}
