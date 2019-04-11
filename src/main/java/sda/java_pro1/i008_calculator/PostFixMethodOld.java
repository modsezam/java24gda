package sda.java_pro1.i008_calculator;

import java.util.Stack;

public class PostFixMethodOld {

    private Stack<Character> calcStack = new Stack<>();
    private StringBuffer postFixStringBuffer = new StringBuffer();

    private char temp;

    public String changeToPostFix(String text) {

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

    }


    private int checkPriority(char symbol) {

        int priority = -1;

        if (symbol == '('){
            priority = 0;
        }
        else if (symbol == '+' || symbol == '-' || symbol == ')'){
            priority = 1;
        }
        else if (symbol == '*' || symbol == '/' || symbol == '%'){
            priority = 2;
        }
        else if (symbol == '^'){
            priority = 3;
        }

        return priority;
    }
}
