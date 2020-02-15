package com.nagappans.dsalgolab.strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StringPermutation {
    public Queue<String> findPermutationString(String inputString) {
        int len = inputString.length();
        Queue<String> possibleStrings = new LinkedList<>();
        possibleStrings.add(inputString);
        List<String> currList = new ArrayList<>();
        for (int i=0; i<len; i++) {
            while (!possibleStrings.isEmpty()) {
                String currentString = possibleStrings.remove();
                System.out.println(currentString);
                for (int j = i; j < len; j++) {
                    String combString = swap(currentString.toCharArray(), i, j);
                    currList.add(combString);
                }
            }
            possibleStrings.addAll(currList);
            currList.clear();
        }

        System.out.println(possibleStrings);
        return possibleStrings;
    }

    public String swap(char[] string, int i, int j) {
        Character tempChar = string[i];
        string[i] = string[j];
        string[j] = tempChar;
        return new String(string);
    }
}
