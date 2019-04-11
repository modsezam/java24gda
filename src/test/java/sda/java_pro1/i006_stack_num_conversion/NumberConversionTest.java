package sda.java_pro1.i006_stack_num_conversion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class NumberConversionTest {

    @Test
    void shouldCreateValidBinaryValue() {
        //given
        int number = 1987;

        //when
        String bin = NumberConversion.numberConversion(number, 2);
        String oct = NumberConversion.numberConversion(number, 8);
        String hex = NumberConversion.numberConversion(number, 16);

        //then
        Assertions.assertEquals("11111000011", bin);
        Assertions.assertEquals("3703", oct);
        Assertions.assertEquals("7C3", hex);

    }
}