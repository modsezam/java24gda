package sda.java_pro1.i008_calculator;

import com.google.common.primitives.Doubles;

import java.util.Stack;
import java.util.StringTokenizer;

public class CalculatorMethod {

    private Stack<Double> stackOperation = new Stack<>();

    public Double calculate(String text) {

        StringTokenizer stringTokenizer = new StringTokenizer(text, " ");

        String temp;
        while (stringTokenizer.hasMoreTokens()) {

            temp = stringTokenizer.nextToken();

            if (Doubles.tryParse(temp) != null) {
                stackOperation.push(Doubles.tryParse(temp));
            } else if (temp.equals("+") || temp.equals("-") || temp.equals("/") || temp.equals("*")) {
                if (stackOperation.size() >= 2) {
                    stackOperation.push(operation(temp, stackOperation.pop(), stackOperation.pop()));
                } else {
//                    System.out.println("Bad expression format! (err1)");
                    return null;
                }
            } else {
//                System.out.println("Bad expression format! (err2)");
                return null;
            }
        }

        if (stackOperation.size() == 1){
            return stackOperation.pop();
        }
        else {
//            System.out.println("Bad expression format! (err3_)" + stackOperation.size());
        }

        return null;
    }

    private double operation(String typeOperation, double number1, double number2) {

        double result = 0;

        if (typeOperation.equals("+")) result = number1 + number2;
        else if (typeOperation.equals("-")) result = number1 - number2;
        else if (typeOperation.equals("*")) result = number1 * number2;
        else if (typeOperation.equals("/")) result = number1 / number2;
//        else System.out.println("error operation! (err4)");

        return result;
    }

}
