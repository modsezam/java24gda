package sda.javaintro.i011_arrays;

public class Arrays {


    public static void main(String[] args) {

        String[] array1;
        array1 = new String[]{"CollectionsTest", "test2", "test3"};

        int array2[] = new int[]{1, 3, 5};

        int array3[];

        float array4[] = new float[]{ (float)2.4, (float)3.5, (float)4.5};

        // i007_task_encapsulation 1
        writeTable(array1);

        //i007_task_encapsulation 2
        System.out.println(sumIntArray(array2));

        //i007_task_encapsulation 3
        array3 = enumNumbersToArray(3);

        for (int i: array3){
            System.out.println(i);
        }

        // i007_task_encapsulation 4
        array4 = doubleArray(array4);
        for (float i: array4){
            System.out.println(i);
        }




    }


    // method to i007_task_encapsulation 1
    public static void writeTable(String... array){

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }

    // method to i007_task_encapsulation 2
    public static int sumIntArray (int[] array) {

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    // method to i007_task_encapsulation 3
    public static int[] enumNumbersToArray (int sizeOfArray){
        int[] result = new int[sizeOfArray];
        result[0] = 2;

        for (int i = 1; i < sizeOfArray; i++){
            result[i] = result[i-1] + 2;
        }

        return result;
    }

    // method to i007_task_encapsulation 4
    public static float[] doubleArray (float array[]){

        for (int i =0; i < array.length; i++){
            array[i] *= (float)2;
        }
        return array;
    }



}



