package com.stringquestions;

import java.util.ArrayList;
import java.util.Collections;

public class MinCharCountToBeAddedAtFrontToMakeGivenStringPalindrome {

    public static Integer minCharTobeAddedAtFrontToMakeStringPalindromeUsingLPS(String str) {

        int originalSizeOfStr = str.length();

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.toString());

        String reverseStr = sb.reverse().toString();
        String modifiedStr = "$" + reverseStr;
        str = str + modifiedStr;
        System.out.println(str);

        ArrayList<Integer> lps = new ArrayList<>(Collections.nCopies(str.length(), 0));
        int prefix = 0;
        int suffix = 1;

        while (suffix < str.length()) {

            if (str.charAt(prefix) == str.charAt(suffix)) {
                lps.set(suffix, lps.get(prefix) + 1);
                prefix++;
                suffix++;
            } else {

                if (prefix == 0) {
                    lps.set(suffix, 0);
                    suffix++;
                } else {
                    prefix = lps.get(prefix - 1);
                }
            }

        }

        System.out.println("Final Elements in LPS list : " + lps.toString());
        return originalSizeOfStr - lps.get(str.length() - 1);

    }

    public static void main(String[] args) {

//      String str = "abc";
        String str = "aaaotcaakr";
        int minNoToBeAddedAtFront = MinCharCountToBeAddedAtFrontToMakeGivenStringPalindrome.minCharTobeAddedAtFrontToMakeStringPalindromeUsingLPS(str);
        System.out.println("MinChar To Be Added At Front To Make Given String Palindrome : " + minNoToBeAddedAtFront);

    }
}
