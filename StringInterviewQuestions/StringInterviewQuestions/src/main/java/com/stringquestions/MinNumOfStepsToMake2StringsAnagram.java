

public class MinNumOfStepsToMake2StringsAnagram{


     public static int [] getFrequencyOfEachCharacterInString(String s){
          
          int [] freq = new int [26];

          for(char c : s.toCharArray()){
              freq[c - 'a']++;
          } 
          return freq;
     }


     public static void main(String [] args){

         String s = "leetcode";
         String t = "coats";
         int result = 0;

         int [] freq_1 =  MinNumOfStepsToMake2StringsAnagram.getFrequencyOfEachCharacterInString(s);

         int [] freq_2 =  MinNumOfStepsToMake2StringsAnagram.getFrequencyOfEachCharacterInString(t);

         for(int i = 0; i < 26; i++){
            
             int maxFreqOfSameChar = Math.max(freq_1[i],freq_2[i]);           
             result = result + (maxFreqOfSameChar - freq_1[i]) + (maxFreqOfSameChar - freq_2[i]);

         }

         System.out.println(result);
     }
}