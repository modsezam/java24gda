package sda.javaintro.i009_loops;



public class Loops {

    public static void main(String[] args) {

        //i007_task_encapsulation 1
        evenNumber(10);

        //i007_task_encapsulation 2
        nPower(0, 2);

        //i007_task_encapsulation 3
        latinAlphabetFor();





    }

    public static void evenNumber(int n) {


        int i = 2;
        int numberOfOccurrences = 0;
        while (numberOfOccurrences < n) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
                numberOfOccurrences++;
            }
            i++;
        }
        System.out.print("\n");
    }

    public static void nPower (int n, int a){
        int b = a;
        if (n < 0){
            System.out.println("error!");
        }
        else if (n == 0){
            b = 1;
        }
        else if (n>0){
            for (int i = 1; i < n; i++){
                b *= a;
            }

        }
        System.out.println(b);
    }

    public static void latinAlphabetFor(){

        char a = 'A';
        char z = 'Z';

        for (int i = a; i < z; i++){
            System.out.print((char)i);
            i++;
        }
        System.out.print("\n");


    }

}
