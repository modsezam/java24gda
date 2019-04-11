package sda.java_pro1.i006_stack_num_conversion;

import java.util.Stack;

public class NumberConversion {

    public static void main(String[] args) {

        int numberTest = 167888;
        int numberSystem = 16;

        System.out.println("Test number: " + numberTest + " to numberSystem: " + numberSystem);
        System.out.println(numberConversion(numberTest, numberSystem));

    }

    public static String numberConversion(int numberDecimal, int numberSystem) {

        Stack<String> numberStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int modulo;

        while (numberDecimal > 0) {

            modulo = numberDecimal % numberSystem;

            if (modulo < 10) {
                numberStack.push(Integer.toString(modulo));

            } else {
                numberStack.push(getHexLetter(modulo));
            }

            numberDecimal /= numberSystem;

        }

        while (!numberStack.empty()) {
            result.append(numberStack.pop());
        }

        return result.toString();
    }

    private static String getHexLetter(int number) {
        String result = "";

        switch (number) {
            case 10: {
                result = "A";
                break;
            }
            case 11: {
                result = "B";
                break;
            }
            case 12: {
                result = "C";
                break;
            }
            case 13: {
                result = "D";
                break;
            }
            case 14: {
                result = "E";
                break;
            }
            case 15: {
                result = "F";
                break;
            }
        }
        return result;
    }


}

