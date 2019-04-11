package sda.javaintro.i024_concurrent;

public class CustomThread extends Thread {
    public CustomThread() {}

    double result;
    double number;

    public CustomThread(String name, double number) {
        super(name);
        this.number = number;

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        result = Math.pow(2, number);
        System.out.println(Thread.currentThread().getName() + " result = " + result);
    }
}
