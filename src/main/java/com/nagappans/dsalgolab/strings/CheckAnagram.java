package com.nagappans.dsalgolab.strings;

import java.util.HashMap;

public class CheckAnagram {
    public boolean isAnagramHashMapApproach(String str1, String str2) {
        //remove spaces
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        //if string size doesn't matches
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCntMap = new HashMap<>();
        //prepare the cnt map
        for (int i=0; i<str1.length(); i++) {
            Character char1 = Character.toUpperCase(str1.charAt(i));
            if (charCntMap.get(char1)==null) {
                charCntMap.put(char1, 1);
            } else {
                int cnt1 = charCntMap.get(char1)+1;
                charCntMap.put(char1, cnt1);
            }
        }
        //
        for (int i=0; i<str2.length(); i++) {
            Character char2 = Character.toUpperCase(str2.charAt(i));
            if (charCntMap.get(char2)==null) {
                return false;
            } else {
                int cnt2 = charCntMap.get(char2)-1;
                if (cnt2==0) {
                    charCntMap.remove(char2);
                } else {
                    charCntMap.put(char2, cnt2);
                }
            }
        }
        if (charCntMap.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isAnagramBitwiseOperations(String str1, String str2) {
        //remove spaces
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        int result = 0;
        for (int i=0; i<str1.length(); i++) {
            result = result ^ str1.charAt(i);
        }
        for (int i=0; i<str2.length(); i++) {
            result = result ^ str2.charAt(i);
        }
        if (result==0) {
            return true;
        } else {
            return false;
        }
    }
}
