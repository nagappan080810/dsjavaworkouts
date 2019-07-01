package com.nagappans.dsalgolab.bitwiseoperations;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ArithmeticWithoutArithmeticOperatorsTest {


    @Test
    public void testadd() {
        ArithmeticWithoutArithmeticOperators arithmeticWithoutArithmeticOperators =
                new ArithmeticWithoutArithmeticOperators();
        System.out.println(arithmeticWithoutArithmeticOperators.add(2, 3));
        assertTrue(arithmeticWithoutArithmeticOperators.add(2, 3 )==5);
    }

    @Test
    public void testmultiply() {
        ArithmeticWithoutArithmeticOperators arithmeticWithoutArithmeticOperators =
                new ArithmeticWithoutArithmeticOperators();
        System.out.println(arithmeticWithoutArithmeticOperators.multiply(3, 2));
        assertTrue(arithmeticWithoutArithmeticOperators.multiply(3, 2)==6);
        assertTrue(arithmeticWithoutArithmeticOperators.multiply(3, 5)==15);
        System.out.println(Integer.toBinaryString(2<<2));
    }
}
