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

        Triangle trialangle1 = new Triangle(0, 2, 2);


        System.out.println("sda.oop.Triangle a = " + trialangle1.getA() + ", b = " + trialangle1.getB() + ", c = " + trialangle1.getC() + " is rectangular triangle:");
        System.out.println(trialangle1.isRectangular());

        trialangle1.setA(3);
        trialangle1.setB(4);
        trialangle1.setC(5);

        System.out.println("sda.oop.Triangle a = " + trialangle1.getA() + ", b = " + trialangle1.getB() + ", c = " + trialangle1.getC() + " is rectangular triangle:");
        System.out.println(trialangle1.isRectangular());

    }
}
