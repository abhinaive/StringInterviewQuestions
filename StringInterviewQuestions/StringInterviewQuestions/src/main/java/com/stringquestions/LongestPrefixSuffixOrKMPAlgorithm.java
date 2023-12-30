package com.stringquestions;

import java.util.ArrayList;
import java.util.Collections;

public class LongestPrefixSuffixOrKMPAlgorithm {

    public static Integer kmpAlgorithmOrLongestPrefixSuffix(String str) {

        int prefix = 0;
        int suffix = 1;

        ArrayList<Integer> lpsArr = new ArrayList<>(Collections.nCopies(str.length(), 0));
        System.out.println("Initial Elements in LPS arr :" + lpsArr.toString());

        while (suffix < str.length()) {

            if (str.charAt(prefix) == str.charAt(suffix)) {
                lpsArr.set(suffix, prefix + 1);
                prefix++;
                suffix++;
            } else {

                if (prefix == 0) {
                    lpsArr.set(suffix, 0);
                    suffix++;
                } else {
                    prefix = lpsArr.get(prefix - 1);
                }

            }

        }
        System.out.println("Final Elements in LPS arr :" + lpsArr.toString());
        return lpsArr.get(str.length()-1);

    }


    public static void main(String[] args) {

        String str = "abab";

        int longestPrefixSuffixLength  = LongestPrefixSuffixOrKMPAlgorithm.kmpAlgorithmOrLongestPrefixSuffix(str);
        System.out.println("longestPrefixSuffixLength : "  + "for string : " + str + " " + "is " + longestPrefixSuffixLength);

    }

}
