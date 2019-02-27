package sda.test;

public class MyPoint {

    public double a;
    public double b;


    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double calculateDistance() {
        return (Math.pow(this.a, 2)) + (Math.pow(this.b, 2));

    }



}
