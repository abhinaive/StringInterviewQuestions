package com.stringinterviewproblems;

import java.util.ArrayList;
import java.util.Collections;

/*

public final class CheckIfPangram {
	
	public static boolean checkIfPangram(String sentence) {
		
		ArrayList<Integer> alphabet = new ArrayList<>(Collections.nCopies(26, 0));
		
		System.out.println(alphabet.toString());
		char [] alphabetArray = sentence.toCharArray();
		
		for(int i = 0; i < alphabetArray.length; i++) {
			alphabet.add(alphabetArray[i]-97,alphabet.get(alphabetArray[i]-97)+1);
		}
		
		System.out.println(alphabet.toString());
		
        for(int count : alphabet) {
         	if(count == 0)
		         return false;
        }

		return true;
	}

	public static void main(String[] args) {
		
		boolean checkIfPangram = CheckIfPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
		System.out.println(checkIfPangram);

	}

}

*/

 
public final class CheckIfPangram {

    public static boolean checkIfPangram(String sentence) {
        // Initialize the alphabet list with zeros
        ArrayList<Integer> alphabet = new ArrayList<>(Collections.nCopies(26, 0));

        System.out.println(alphabet.toString());
        
        // Convert the sentence to lowercase for case-insensitivity
        char[] alphabetArray = sentence.toLowerCase().toCharArray();

        for (int i = 0; i < alphabetArray.length; i++) {
            // Check if the character is an English lowercase letter
            if (Character.isLetter(alphabetArray[i])) {
                alphabet.set(alphabetArray[i] - 'a', alphabet.get(alphabetArray[i] - 'a') + 1);
            }
        }

        System.out.println(alphabet.toString());
        
        // Check if any alphabet letter has a count of 0
        for (int count : alphabet) {
            if (count == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean isPangram = CheckIfPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazyog");
        System.out.println(isPangram);
    }
}

