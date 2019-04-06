package sda.javaintro.i024_concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThread {

    public static void main(String[] args) {


        System.out.println("Threads: " + Runtime.getRuntime().availableProcessors());

        long start = System.currentTimeMillis();
        System.out.println("Start ExecutorService!");

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        executorService.shutdown();
        //executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        System.out.println("Done!");

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms");


    }



}
