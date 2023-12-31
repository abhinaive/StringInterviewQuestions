package com.stringquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinCharactersToBeAddedAtFrontToMakeGivenStringPalindrome {

    public static ArrayList<Character> minCharTobeAddedAtFrontToMakeStringPalindromeUsingLPS(String str) {

        int originalSizeOfStr = str.length();
        String originalString = str;

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

        ArrayList<Character> minCharArrayTobeAddedInFront = new ArrayList<>();
        char [] charArr = str.toCharArray();

        System.out.println(originalSizeOfStr - lps.get(str.length() - 1));
        for(int i = originalString.length() - 1; i >= originalSizeOfStr - (originalSizeOfStr - lps.get(str.length() - 1)); i--){
            charArr[i] = originalString.charAt(i);
//          System.out.println(charArr[i]);
            minCharArrayTobeAddedInFront.add(charArr[i]);
//          System.out.println("i : " + i  + " " + charArr[i]);
        }

        return minCharArrayTobeAddedInFront;

    }

    public static void main(String[] args) {

 //     String str = "abc";
        String str = "aaaotcaakr";
        ArrayList<Character> minCharactersToBeAddedAtFront = MinCharactersToBeAddedAtFrontToMakeGivenStringPalindrome.minCharTobeAddedAtFrontToMakeStringPalindromeUsingLPS(str);
        System.out.println("MinChar To Be Added At Front To Make Given String Palindrome : " + minCharactersToBeAddedAtFront.toString());

    }
}
