package com.nagappans.dsalgolab.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionPalindrome {

    public boolean isPalindrome(String input) {
        Pattern pattern = Pattern.compile("/^(.*).?(?rev:\1)$/");
        Matcher matcher =  pattern.matcher(input);
        return matcher.matches();
    }
}
