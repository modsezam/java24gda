package sda.java_pro1.i007_brackets_check;

public class Main {

    public static void main(String[] args) {

        BracketCheckLinkedList bracketCheckLinkedList = new BracketCheckLinkedList();
        BracketCheckStack bracketCheck2 = new BracketCheckStack();

        System.out.println( bracketCheckLinkedList.validBracket("())(") );
        System.out.println( bracketCheck2.validBracket("())(") );

    }

}
