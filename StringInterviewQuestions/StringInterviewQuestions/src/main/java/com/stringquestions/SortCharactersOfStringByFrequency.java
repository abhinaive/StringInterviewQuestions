import java.util.*;


public class SortCharactersOfStringByFrequency{


  public static String sortCharactersUsingBucketSort(String str){

       if(str == null)
          return null;

       Map<Character, Integer> map = new HashMap<>();
       char [] charArr = str.toCharArray();
       int max = 0;

       for(Character c : charArr){
           
           if(!map.containsKey(c)){
              map.put(c,0);
           }

           map.put(c, map.get(c)+1);
           max = Math.max(max,map.get(c));
       }

       List<Character> [] array = buildBucketArray(map,max);
   
       return buildOutputString(array);
  }

   @SuppressWarnings("unchecked")
   public static List<Character> [] buildBucketArray(Map<Character, Integer> map, int maxCount){

       List<Character> [] listOfCharArr = (List<Character>[])new List[maxCount + 1];

       for(Character c : map.keySet()){
          int count = map.get(c);
          
          if(listOfCharArr[count] == null){
              listOfCharArr[count] = new ArrayList<>();
          }

          listOfCharArr[count].add(c);
       }

       return listOfCharArr;
   }

   public static String buildOutputString(List<Character> [] listOfCharArr){
  
        StringBuilder sb = new StringBuilder();

        for(int i = listOfCharArr.length - 1; i >= 0; i--){
            
            List<Character> list = listOfCharArr[i];

            if(list != null){
                for(Character c : list){
                    for(int j = 0; j < i; j++){
                        sb.append(c);
                    }
                }
            }

        }

        return sb.toString();
   } 


  public static String sortCharactersUsingPrirityQueue(String str){   // nlogn

       Map<Character, Integer> map = new HashMap<>();

       for(int i = 0; i < str.length(); i++){
          map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0) + 1);
       }

       PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
         (a,b) -> (b.getValue() - a.getValue())
       );

       pq.addAll(map.entrySet());
       String ans = " ";

       while(!pq.isEmpty()){

         Map.Entry<Character, Integer> head = pq.poll();
         int frequency = head.getValue();

           while(frequency > 0){
              ans += head.getKey();
              frequency--;
           }
       } 

       return ans; 
  }

  public static void main(String [] args){

     String s = "xxbxbccgcggxgg";

     String str1 = SortCharactersOfStringByFrequency.sortCharactersUsingPrirityQueue(s); 
     System.out.println(str1);    // gggggxxxxcccbb

     System.out.println();
     String str2 = SortCharactersOfStringByFrequency.sortCharactersUsingBucketSort(s);
     System.out.println(str2);
  }

}