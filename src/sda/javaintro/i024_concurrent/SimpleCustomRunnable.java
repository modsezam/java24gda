package sda.javaintro.i024_concurrent;

public class SimpleCustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("SimpleCustomRunnable!");
    }

    public static void main(String[] args) {
        SimpleCustomRunnable runnable = new SimpleCustomRunnable();

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
