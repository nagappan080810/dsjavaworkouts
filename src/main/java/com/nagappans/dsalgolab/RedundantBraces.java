package com.nagappans.dsalgolab;

/*
 * Solution to the redudant braces - check whether has redundant braces to yes(1) or no(0).
 * https://www.interviewbit.com/problems/redundant-braces/
 */
public class RedundantBraces {
    public int braces(String str) {
        Stack<Character> exprStack = new Stack<>();
        boolean isSecondQuote = false;
        for (int i=0; i<str.length(); i++) {
            Character exprChar = str.charAt(i);
            if (exprChar!=')' && (exprChar!='\"' && isSecondQuote ) ) {
                exprStack.push(str.charAt(i));
            } else {
                int cnt=0;
                while(exprStack.pop()!='(' ) {
                    cnt++;
                }
                //there is no expression, so return it as redudant braces..
                if (cnt==0) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
