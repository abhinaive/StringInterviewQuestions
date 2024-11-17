

public class MoveEachLetterByTwoLetter{


   public static void main(String [] args){
    
      String s = "SIMPLY";
      String n = "";

      for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);

            if(c == 'Y' || c == 'Z'){
                int ascii_1 = (c - 'A' + 2)%26 + 'A';
                n = n + (char)ascii_1;
            }else{
                int ascii_2 = c + 2;
                n = n + (char)ascii_2;
            }
          
      }

      System.out.println(n);

   }

}