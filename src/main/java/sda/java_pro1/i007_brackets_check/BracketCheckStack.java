package sda.java_pro1.i007_brackets_check;

import java.util.Stack;

public class BracketCheckStack {

    Stack<Character> bracketStack = new Stack<>();
    char temp;

    public boolean validBracket(String text) {

        for (int i = 0; i < text.length(); i++) {
            temp = text.charAt(i);
            if (temp == '(') {
                bracketStack.add(temp);
            }
            if (temp == ')') {
                if (bracketStack.isEmpty()) {
                    return false;
                }
                bracketStack.pop();
            }
        }
        return bracketStack.isEmpty();
    }
}
