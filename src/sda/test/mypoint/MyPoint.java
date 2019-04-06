package sda.test.mypoint;

import java.util.Scanner;

public class MyPoint {

    public double a;
    public double b;
    public double[] distance = new double [99];
    public int pointNumber;

    Scanner scanner = new Scanner(System.in);

    public int getPointNumber() {
        return pointNumber;
    }

    private double calculateDistance() {
        return Math.sqrt((this.a*this.a) + (this.b*this.b));
    }

    public double getDistance(int i) {
        return distance[i];
    }

    public void numberOfPoints(){
        System.out.println("Give the number of points (1-100):");
        pointNumber = scanner.nextInt();
    }

    public void handlingXY (){
        if (pointNumber >= 1 && pointNumber <= 100){
            for (int i = 0; i < pointNumber; i++){
                System.out.println("Give the X coordinate of the point: " + ( i + 1 ) );
                a = scanner.nextDouble();
                System.out.println("Give the Y coordinate of the point: " + ( i + 1 ) );
                b = scanner.nextDouble();
                distance[i] = calculateDistance();
            }
        }
        else
            System.out.println("You gave the wrong number of points!");
    }

}
