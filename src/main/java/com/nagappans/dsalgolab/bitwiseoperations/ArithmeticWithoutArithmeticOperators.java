package com.nagappans.dsalgolab.bitwiseoperations;

public class ArithmeticWithoutArithmeticOperators {
    public int add(int a, int b) {
        int sum=0, carry=0, prevSum=0;
        sum = a ^ b;
        carry = a & b;
        while (carry>0) {
            carry = carry << 1;
            prevSum = sum;
            sum = sum ^ carry;
            carry = prevSum & carry;
        }
        return sum;
    }

    public int multiply(int a, int b) {
        int product = a;
        for (int i=1; i<b; i++) {
            product = add(product, a);
        }
        return product;
    }


}
