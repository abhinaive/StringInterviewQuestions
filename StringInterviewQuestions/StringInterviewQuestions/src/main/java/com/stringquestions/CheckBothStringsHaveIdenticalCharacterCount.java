package com.stringquestions;

public class CheckBothStringsHaveIdenticalCharacterCount {


    public boolean identicalCharacterCountsOrNot(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[128];

        char [] s_array = s.toCharArray();

        for(char c : s_array){
            System.out.print(c + " -> " + (int)c + ", " );
            System.out.print(letters[c] + ", ");
            letters[c]++;
            System.out.print(letters[c]);
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < t.length(); i++ ){
             System.out.print(t.charAt(i) + "-> ");

             int c = (int)t.charAt(i);
             System.out.print(c + ", ");
             letters[c]--;
             System.out.print(letters[c]);
             System.out.println();

             if(letters[c] < 0){
                 return false;
             }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "abcd";
        String t = "dabc";

        CheckBothStringsHaveIdenticalCharacterCount cbsicc = new CheckBothStringsHaveIdenticalCharacterCount();

        cbsicc.identicalCharacterCountsOrNot(s,t);


    }

}

