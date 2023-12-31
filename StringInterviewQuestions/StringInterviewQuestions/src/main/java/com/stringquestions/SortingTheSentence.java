package com.stringinterviewproblems;

import java.util.ArrayList;


public class SortingTheSentence {
	
	public static String sortSentence(String str) {
		
		String word = "";
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < str.length(); i++) {
			
			char currentChar = str.charAt(i);
			
			if(str.charAt(i) >= 48 && str.charAt(i)<= 57) {
				list.set(currentChar - 48,word + " ");
				word = "";
				i++;
			}
			else 
				word += str.charAt(i);
		}
		
		String ans = "";
		
		for(String s : list) {
			ans += s;
		}
		
		return ans.toString().trim();
	}

	public static void main(String[] args) {
		
		String str = "is2 sentence4 This1 a3";	
		System.out.println(SortingTheSentence.sortSentence(str));

	}

}


/*
public class SortingTheSentence {

    public static String sortSentence(String str) {

        String word = "";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar >= 48 && currentChar <= 57) {
                list.add(currentChar - 48 - 1, word);
                word = "";
                i++;
            } else {
                word += currentChar;
            }
        }

        // Add the last word to the list
        list.add(word);

        StringBuilder ans = new StringBuilder();

        for (String s : list) {
            ans.append(s).append(" ");
        }

        return ans.toString().trim();
    }

    public static void main(String[] args) {

        String str = "is2 sentence4 This1 a3";
        System.out.println(SortingTheSentence.sortSentence(str));

    }
}

*/