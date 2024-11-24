import java.util.*;

public class SubstringWithConcatOfAllWords{

    public static List<Integer> findStartAndEndIndexOfTheSubstringFormedByConcatOfWordsInAnyOrder(String str, String [] words){

          List <Integer> result = new ArrayList<>();

          int lenOfEachWord = words[0].length();

          Map <String,Integer> map = new HashMap<>();

          for(String word : words ){
             map.put(word, map.getOrDefault(word,0) + 1);
          }

          for(int i = 0; i <= str.length() - lenOfEachWord*words.length; i++){ // max value of i (start) can be [str.length - 3*3]

               Map <String,Integer> copyMap = new HashMap<>(map); 

               for(int j = 0; j < words.length; j++){  // 0  1  2

                    String s = str.substring(i + j*lenOfEachWord, i + j*lenOfEachWord + lenOfEachWord); // substring of 3 letters at time 

                    if(copyMap.containsKey(s)){
                        int count = copyMap.get(s);

                        if(count == 1){
                            copyMap.remove(s);
                        }else{
                            copyMap.put(s,count - 1);
                        }

                        if(copyMap.isEmpty()){
//                          System.out.println(i);
                            result.add(i);
                            break;
                        }

                    }else{
                        break;
                    }
               }                  
          }

          return result;
    }

    public static void main(String [] args){

          String str = "barfoofoobarthefoobarman";

          String [] words = {"bar","the","foo"};
 
          List<Integer> indicesList = SubstringWithConcatOfAllWords.findStartAndEndIndexOfTheSubstringFormedByConcatOfWordsInAnyOrder(str,words);

          for(int idx : indicesList){
            System.out.println(idx);
          }
                     

    } 
    
}


/*

public class SubstringWithConcatOfAllWords {

    public static List<Integer> findStartAndEndIndexOfTheSubstringFormedByConcatOfWordsInAnyOrder(String str, String[] words) {
        List<Integer> result = new ArrayList<>();
        int lenOfEachWord = words[0].length();
        int totalLength = lenOfEachWord * words.length;

        // Create a map of word frequency in the words array
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Loop through the string and check all possible substrings of totalLength
        for (int i = 0; i <= str.length() - totalLength; i++) {
            // Create a copy of the word count map for this substring
            Map<String, Integer> copyMap = new HashMap<>(wordCountMap);
            int j = 0;

            // Check each word in the current substring
            while (j < words.length) {
                // Get the current word from the substring
                String currentWord = str.substring(i + j * lenOfEachWord, i + (j + 1) * lenOfEachWord);
                
                // If the word is valid and still available in the map
                if (copyMap.containsKey(currentWord)) {
                    int count = copyMap.get(currentWord);
                    if (count == 1) {
                        copyMap.remove(currentWord);
                    } else {
                        copyMap.put(currentWord, count - 1);
                    }
                } else {
                    break; // If any word is not found, break the loop
                }

                j++; // Move to the next word
            }

            // If all words are found and the map is empty, add the starting index to result
            if (copyMap.isEmpty()) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "barfoofoobarthefoobarman";
        String[] words = {"bar", "the", "foo"};

        List<Integer> indicesList = SubstringWithConcatOfAllWords.findStartAndEndIndexOfTheSubstringFormedByConcatOfWordsInAnyOrder(str, words);

        for (int idx : indicesList) {
            System.out.println(idx);
        }
    }
}
*/