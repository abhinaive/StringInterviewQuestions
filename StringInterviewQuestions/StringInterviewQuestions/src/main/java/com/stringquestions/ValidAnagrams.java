package com.stringquestions;

import java.util.Arrays;

public class ValidAnagrams {


    public static boolean isAnagramsValidCaseSenitive(String s, String t){

        if(s.length() != t.length())
            return false;

        int [] alphabet = new int[127];

        for(int i = 0; i < s.length() ; i++ ) {

            Character c = s.charAt(i);
            System.out.println(s.charAt(i));
            Character d = t.charAt(i);
            System.out.println(t.charAt(i));
            System.out.println();

            if (Character.isUpperCase(c)) {
                alphabet[s.charAt(i) - 'A']++;
            }
            if (Character.isUpperCase(d)){
                alphabet[t.charAt(i) - 'A']--;
            }
            if (Character.isLowerCase(c)){
                alphabet[s.charAt(i) - 'a']++;
            }
            if (Character.isLowerCase(d)){
                alphabet[t.charAt(i) - 'a']--;
            }

        }

        System.out.println(Arrays.toString(alphabet));
        for(int n : alphabet){
            if(n != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "aBCDEFG";
        String t = "GFEaBDC";

        boolean areStringsValidAnagrams =  isAnagramsValidCaseSenitive(s,t);

        System.out.println("The given strings are valid T/F : " + areStringsValidAnagrams);
    }
}
