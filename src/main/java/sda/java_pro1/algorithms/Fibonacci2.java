package sda.java_pro1.algorithms;

public class Fibonacci2 {



    public static void main(String[] args) {

        int fib = 1;

        System.out.println(fibonacciMethod(fib));
        System.out.println(fibonacciMethodRek(fib));

    }


    private static int fibonacciMethod(int n){

        int[] fibonacciTab = new int[100];
        int result = 0;

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        fibonacciTab[0] = 0;
        fibonacciTab[1] = 1;

        for (int i = 2; i <= n; i++){
            fibonacciTab[i] = fibonacciTab[i-1] + fibonacciTab [i-2];
            result = fibonacciTab[n];
        }

        return result;
    }


    private static int fibonacciMethodRek(int n){

        if (n < 2){
            return n;
        }
        return fibonacciMethodRek(n -1) + fibonacciMethodRek(n - 2);
    }



}
