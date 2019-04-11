package sda.java_pro1.i008_calculator;

import com.google.common.primitives.Doubles;

import java.util.Stack;
import java.util.StringTokenizer;

public class PostFixMethod {

    private Stack<String> calcStack = new Stack<>();
    private StringBuffer postFixStringBuffer = new StringBuffer();

    public String changeToPostFix(String text) {

        StringTokenizer stringTokenizer = new StringTokenizer(text, " ");

        String temp;
        while (stringTokenizer.hasMoreTokens()) {

            temp = stringTokenizer.nextToken();

            if (Doubles.tryParse(temp) != null) {
//                System.out.println("Doubles parse: " + Doubles.tryParse(temp));
                postFixStringBuffer.append(Doubles.tryParse(temp)).append(" ");
            } else if (temp.equals("(")) {
                calcStack.push(temp);
            } else if (temp.equals(")")) {

                while (!calcStack.isEmpty() && !calcStack.peek().equals("(")) {
                    postFixStringBuffer.append(calcStack.pop()).append(" ");
                }
                if (!calcStack.isEmpty() && calcStack.peek().equals("(")) {
                    calcStack.pop();
                }

            }

            else if (temp.equals("^") || temp.equals("*") || temp.equals("/") || temp.equals("%") || temp.equals("+") || temp.equals("-")) {

                while (!calcStack.isEmpty()) {

                    if (checkPriority(temp) <= checkPriority(calcStack.peek())) {
                        postFixStringBuffer.append(calcStack.pop()).append(" ");
                    } else if (checkPriority(temp) > checkPriority(calcStack.peek())) {
                        calcStack.push(temp);
                        break;
                    } else {
                        calcStack.push(temp);
                    }
                    if (!calcStack.isEmpty() && calcStack.peek().equals("(")) {
                        calcStack.pop();
                        break;
                    }
                }
                if (calcStack.isEmpty()) {
                    calcStack.push(temp);
                }
            }

            else {
                return null;
            }
        }

        while (!calcStack.isEmpty()) {

            if (calcStack.peek().equals("(")) {
                calcStack.pop();
            } else {
                postFixStringBuffer.append(calcStack.pop()).append(" ");
            }
        }


        String postFix = postFixStringBuffer.toString().trim();
        postFixStringBuffer.delete(0, postFixStringBuffer.length());
        return postFix;
/*
        for (int i = 0; i < text.length(); i++) {

            temp = text.charAt(i);
            if (temp == ' ') {

            } else if (Character.isDigit(temp)) {
                postFixStringBuffer.append(temp).append(" ");
            } else if (temp == '(') {
                calcStack.push(temp);
            } else if (temp == ')') {

                while (!calcStack.isEmpty() && calcStack.peek() != '(') {
                    postFixStringBuffer.append(calcStack.pop()).append(" ");
                }
                if (!calcStack.isEmpty() && calcStack.peek() == '(') {
                    calcStack.pop();
                }

            } else if (temp == '^' || temp == '*' || temp == '/' || temp == '%' || temp == '+' || temp == '-') {

                while (!calcStack.isEmpty()) {

                    if (checkPriority(temp) <= checkPriority(calcStack.peek())) {
                        postFixStringBuffer.append(calcStack.pop()).append(" ");
                    } else if (checkPriority(temp) > checkPriority(calcStack.peek())) {
                        calcStack.push(temp);
                        break;
                    } else {
                        calcStack.push(temp);
                    }
                    if (!calcStack.isEmpty() && calcStack.peek() == '(') {
                        calcStack.pop();
                        break;
                    }
                }
                if (calcStack.isEmpty()) {
                    calcStack.push(temp);
                }
            }
        }

        while (!calcStack.isEmpty()) {

            if (calcStack.peek() == '(') {
                calcStack.pop();
            } else {
                postFixStringBuffer.append(calcStack.pop()).append(" ");
            }
        }

        String postFix = postFixStringBuffer.toString().trim();
        postFixStringBuffer.delete(0, postFixStringBuffer.length());
        return postFix;
*/

    }


    private int checkPriority(String symbol) {

        int priority = -1;

        if (symbol.equals("(")) {
            priority = 0;
        } else if (symbol.equals("+") || symbol.equals("-") || symbol.equals(")")) {
            priority = 1;
        } else if (symbol.equals("*") || symbol.equals("/") || symbol.equals("%")) {
            priority = 2;
        } else if (symbol.equals("^")) {
            priority = 3;
        }

        return priority;
    }
}
