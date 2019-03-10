package sda.javaintro.i017_stat;

public class Math {

    private Math() {
    }

    static double PI = 3.14;


    static int add(int a, int b) {
        return a + b;
    }

    static int substract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    static int pow(int a, int b){
        int wynik = 1;
        for (int i = 0; i < a; i++){
            wynik *= a;
        }
        return wynik;

    }

    static double circumFerence(double a) {
        return PI * a * a;
    }


}
