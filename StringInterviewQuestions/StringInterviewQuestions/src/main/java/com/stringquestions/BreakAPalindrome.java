

public class BreakAPalindrome{


   public static String breakPalindromeAndMakeItLexicograficallySmallest(String str){

      if(str.length() == 1)   // Ex : "a";
          return "";

      for(int i = 0; i < str.length(); i++){

         int j = str.length() - 1 - i;       // Gives Symmetrically Opposite index from end of string as from the start
     
         if(i == j)                         // Ex : aaayaaa -> changing y will not serve the purpose
             continue;

         if(str.charAt(i) != 'a'){          // Ex : abccba || abcycba
            char [] charseq = str.toCharArray();
            charseq[i] = 'a';
            return String.valueOf(charseq); 
         }

      }
    
      char [] charseq = str.toCharArray();  // Ex : aaayaaa -> changing y will not serve the purpose instead change the last character
      charseq[str.length() - 1] = 'b';
      return String.valueOf(charseq);

   }  

   public static void main(String [] args){

       String str1 = "abccba";
       String str2 = "a";
       String str3 = "abcycba";
       String str4 = "aaayaaa";

       String string = breakPalindromeAndMakeItLexicograficallySmallest(str4);
       System.out.println(string);

   }

}