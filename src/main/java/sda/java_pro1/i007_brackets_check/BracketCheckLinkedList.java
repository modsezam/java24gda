package sda.java_pro1.i007_brackets_check;

import java.util.LinkedList;

public class BracketCheckLinkedList {

    private LinkedList<Character> bracketList = new LinkedList<>();
    char temp;

    public boolean validBracket(String text) {

        for (int i = 0; i < text.length(); i++) {
            temp = text.charAt(i);
            if (temp == '(') {
                bracketList.offer(temp);
            }
            if (temp == ')') {
                if (bracketList.isEmpty()) {
                    return false;
                }
                bracketList.poll();
            }
        }
        return bracketList.isEmpty();
    }
}
