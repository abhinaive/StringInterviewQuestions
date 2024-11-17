

public class PutAllDigitsAtStartOfString{

   public static void main(String [] args){
   
       String allChars = "";
       String allDigits = "";
       String s = "A1B3H9I7";

       for(int i = 0; i < s.length(); i++){
         
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                allDigits = allDigits + c;
            }else if(Character.isAlphabetic(c)){
                allChars = allChars + c;
            }
       }

       System.out.println("New String :" + allDigits + allChars);   

   }

}