package sda.java_pro1.i008_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostFixMethodTest {

    @Test
    void shouldChanceToPostFixWorks() {

        PostFixMethod postFixMethod = new PostFixMethod();

        //given
        String test1 = "( -4 + 4 ) * 2 * ( 3 + 5 )";
        String test2 = "( 3 - 5 ) * 3 / 3 * ( 4 + 5 )";
        String test3= "33 + 3 + a";

        //when
        String result1 = postFixMethod.changeToPostFix(test1);
        String result2 = postFixMethod.changeToPostFix(test2);
        String result3 = postFixMethod.changeToPostFix(test3);

        //then
        Assertions.assertEquals("-4.0 4.0 + 2.0 * 3.0 5.0 + *", result1);
        Assertions.assertEquals("3.0 5.0 - 3.0 * 3.0 / 4.0 5.0 + *", result2);
        assertNull(result3);

    }
}