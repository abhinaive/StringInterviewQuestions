package com.stringinterviewproblems;

import java.util.HashMap;
import java.util.Map;

public class NumberOfMatchingSubSequences {

	public static int numberOfMatchingSubsequence(String s, String[] words) {
		
		int counter = 0;
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String word : words) {
			map.put(word, map.getOrDefault(word,0)+1);
			
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			String key = entry.getKey();
			if(getSubSequenceCount(key,s)) {
				counter += entry.getValue();
			}
		}
		
		return counter;
		
	}
	
	
	public static boolean getSubSequenceCount(String str1, String str2){
		int i = 0;
		int j =0;
		
		while(i < str1.length() && j<str2.length()) {
			if(str1.charAt(i) == str2.charAt(j)) {
				i++;
			}
			j++;
		}
		
		if(i == str1.length()) {
			return true;
		}
		
		return false;
	}
	 
	
	
	public static void main(String[] args) {
		
		String[] words = {"a","bb","acd","ace"};
		String s = "abcde";
	
        System.out.println("Number of matching subseq : " +NumberOfMatchingSubSequences.numberOfMatchingSubsequence(s, words)); 
		
		
	}

}
