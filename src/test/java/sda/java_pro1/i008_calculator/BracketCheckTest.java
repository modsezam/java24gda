package sda.java_pro1.i008_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BracketCheckTest {

    @Test
    public void shouldBracketIsValid(){

        BracketCheck bracketCheckLinkedList = new BracketCheck();

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


}