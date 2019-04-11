package sda.java_pro1.i008_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorMethodTest {

    @Test
    void shouldCalculateWorksCorrectly() {

        CalculatorMethod calculatorMethod = new CalculatorMethod();

        //given
        String test1 = " 3 4 + 3 *";
        String test2 = "3 4 + 3 * 4 ";
        String test3 = "3 4 + 3 * a";

        //when
        Double result1 = calculatorMethod.calculate(test1);
        Double result2 = calculatorMethod.calculate(test2);
        Double result3 = calculatorMethod.calculate(test3);

        //when
        Assertions.assertEquals(Double.valueOf(21), result1);
        assertNull(result2);
        assertNull(result3);


    }
}