package com.nagappans.dsalgolab.stacks;

public class BalancedParanthesis {
    public boolean isBalancedParanethesis(String expr) {
        Stack<Character> paranethesis = new Stack<>();
        for (int i=0; i<expr.length(); i++) {
             if (isOpenParanethesis(expr.charAt(i))) {
                paranethesis.push(expr.charAt(i));
             } else {
                 if (paranethesis.peek() == '[' && expr.charAt(i) != ']' ) {
                     return false;
                 }
                 if (paranethesis.peek() == '{' && expr.charAt(i) != '}' ) {
                     return false;
                 }
                 if (paranethesis.peek() == '(' && expr.charAt(i) != ')' ) {
                     return false;
                 }
                 paranethesis.pop();
             }
        }
        if (paranethesis.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isOpenParanethesis(char paranethesis) {
        return paranethesis=='[' || paranethesis=='(' || paranethesis=='{';
    }

}
