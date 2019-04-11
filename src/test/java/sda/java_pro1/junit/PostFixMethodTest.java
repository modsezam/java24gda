package sda.java_pro1.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostFixMethodTest {
    @Test
    public void shouldAddNumbers() {
        // given
        int a = 3;
        int b = 7;

        // when
        int result = Calculator.add(a, b);

        // then
        Assertions.assertEquals(10, result);
    }

    @Test
    public void shouldCheckArray() {
        // given
        int[] arr = new int[4];

        // when

        // then
        Assertions.assertTrue(arr != null);
        Assertions.assertTrue(arr.length > 0);
        Assertions.assertEquals(0, arr[0]);
    }

    @Test
    public void shouldMinusNumber(){

        // given
        int a = 7;
        int b = 3;

        // when
        int result = Calculator.minus(a, b);

        // then
        Assertions.assertEquals(4, result);

    }
}
