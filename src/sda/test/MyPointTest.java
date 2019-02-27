package sda.test;

import java.util.Scanner;

public class MyPointTest {

    public static void main(String[] args) {
        double[] distance = new double[99];
        int pointNumber;

        Scanner scanner = new Scanner(System.in);

        MyPoint point = new MyPoint();

        System.out.println("Give the number of points (1-99):");
        pointNumber = scanner.nextInt();

        if (pointNumber >= 1 && pointNumber <= 99){
            for (int i = 0; i < pointNumber; i++){
                System.out.println("Give the X coordinate of the point: " + ( i + 1 ) );
                point.setA(scanner.nextDouble());
                System.out.println("Give the Y coordinate of the point: " + ( i + 1 ) );
                point.setB(scanner.nextDouble());
                distance[i] = point.calculateDistance();
            }
            System.out.println("Distance from the center of co-ordinates for:");
            for (int i = 0; i < pointNumber; i++){
                System.out.println("point " + ( i + 1 ) + " is " + distance[i]);
            }
        }
        else
            System.out.println("You gave the wrong number of points!");

    }

}
