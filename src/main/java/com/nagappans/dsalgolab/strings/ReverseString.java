package com.nagappans.dsalgolab.strings;

public class ReverseString {
    /*
     * reverse string by splitting input by two and then swap the characters.
     */
    public String reverse(String input) {
        char inputChar[] = input.toCharArray();
        int end = input.length()-1;
        for (int start=0; start<input.length()/2; start++) {
            char temp = inputChar[start];
            inputChar[start] = inputChar[end];
            inputChar[end--] = temp;
        }
        return new String(inputChar);
    }

    public String reverse1(String input) {
        if (input==null) return null;

        char inputChar[] = input.toCharArray();
        int startPos = 0, endPos = inputChar.length-1;
        char temp;
        while(startPos<endPos) {
            temp = inputChar[startPos];
            inputChar[startPos++] = inputChar[endPos];
            inputChar[endPos--] = temp;
        }
        return new String(inputChar);
    }
}
