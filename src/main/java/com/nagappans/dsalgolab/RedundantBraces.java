package com.nagappans.dsalgolab;

/*
 * Solution to the redudant braces - check whether has redundant braces to yes(1) or no(0).
 * https://www.interviewbit.com/problems/redundant-braces/
 */
public class RedundantBraces {
    public int braces(String str) {
        Stack<Character> exprStack = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            Character exprChar = str.charAt(i);
            if (exprChar!=')') {
                exprStack.push(str.charAt(i));
            } else {
                int cnt=0, optcnt=0;
                for(Character temp = exprStack.pop(); temp!='('; temp=exprStack.pop()) {
                    cnt++;
                    if (temp=='+' || temp=='-' || temp=='*' || temp=='/') {
                        optcnt++;
                    }
                }
                //there is no expression, so return it as redudant braces..
                if (cnt==0 || optcnt==0) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
