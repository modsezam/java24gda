package sda.test.mypoint;

public class MyPointTest {

    public static void main(String[] args) {

        MyPoint point = new MyPoint();

        point.numberOfPoints();

        point.handlingXY();

        System.out.println("\nDistance from the center of co-ordinates for:");
        for (int i = 0; i < point.getPointNumber(); i++){
            System.out.println("point " + ( i + 1 ) + " is " + point.getDistance(i));
        }

    }

}
