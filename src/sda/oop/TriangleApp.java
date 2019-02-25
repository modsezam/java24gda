package sda.oop;

/*

lesson 2
date 24.02.2019
content of task (in Polish):

1. Utwórz klasę Triangle i napisz metodę isRectangular(), która jako argumenty przyjmować będzie trzy liczby
całkowite. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można
zbudować trójkąt prostokątny. Wzór który może pomóc: c2 = a2 + b2

 */


public class TriangleApp {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(0, 2, 4);


        System.out.print("sda.oop.Triangle:\na = " + triangle.getA() + ", b = " + triangle.getB() + ", c = " + triangle.getC() + " is rectangular triangle: ");
        System.out.println(triangle.isRectangular());

        triangle.setA(3);
        triangle.setB(4);
        triangle.setC(5);
        System.out.print("a = " + triangle.getA() + ", b = " + triangle.getB() + ", c = " + triangle.getC() + " is rectangular triangle: ");
        System.out.println(triangle.isRectangular());

        int a = 4;
        int b = 5;
        int c = 3;
        System.out.print("a = " + a + ", b = " + b + ", c = " + c + " is rectangular triangle: ");
        System.out.println(triangle.isRectangular(a, b, c));

        a = 9;
        b = 4;
        c = 3;
        System.out.print("a = " + a + ", b = " + b + ", c = " + c + " is rectangular triangle: ");
        System.out.println(triangle.isRectangular(a, b, c));

    }
}
