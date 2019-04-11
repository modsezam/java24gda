package sda.java_pro1.i007_brackets_check;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BracketCheckLinkedListTest {

    @Test
    public void shouldListBracketIsValid(){

        BracketCheckLinkedList bracketCheckLinkedList = new BracketCheckLinkedList();

        //given
        String testTest1 = "()";
        String testTest2 = "(())";
        String testTest3 = "())(";
        String testTest4 = ")()(";

        //when
        boolean result1 = bracketCheckLinkedList.validBracket(testTest1);
        boolean result2 = bracketCheckLinkedList.validBracket(testTest2);
        boolean result3 = bracketCheckLinkedList.validBracket(testTest3);
        boolean result4 = bracketCheckLinkedList.validBracket(testTest4);

        //then
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
        Assertions.assertFalse(result3);
        Assertions.assertFalse(result4);
    }

    @Test
    public void shouldStackBracketIsValid(){

        BracketCheckStack bracketCheck = new BracketCheckStack();

        //given
        String testTest1 = "()";
        String testTest2 = "(())";
        String testTest3 = "())(";
        String testTest4 = ")()(";

        //when
        boolean result1 = bracketCheck.validBracket(testTest1);
        boolean result2 = bracketCheck.validBracket(testTest2);
        boolean result3 = bracketCheck.validBracket(testTest3);
        boolean result4 = bracketCheck.validBracket(testTest4);

        //then
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
        Assertions.assertFalse(result3);
        Assertions.assertFalse(result4);

    }


}
