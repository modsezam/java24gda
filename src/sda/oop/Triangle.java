package sda.oop;

/*

lesson 2
date 24.02.2019
content of task (in Polish):

1. Utwórz klasę Triangle i napisz metodę isRectangular(), która jako argumenty przyjmować będzie trzy liczby
całkowite. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można
zbudować trójkąt prostokątny. Wzór który może pomóc: c2 = a2 + b2

 */

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isRectangular(){

        int temp;

        if (a <= 0 || b <=0 || c<=0){
            return false;
        }

        temp = Math.max(a, b);
        temp = Math.max(c, temp);

        if (temp == a){
            return equation(c, b, a);
        }

        if (temp == b){
            return equation(a, c, b);
        }
        if (temp == c){
            return equation(a, b, c);
        }

        return false;

    }

    public boolean equation (int a, int b, int c){
        if ( c == Math.sqrt(a*a + b*b) ){
            return true;
        }
        else
            return false;
    }

}
