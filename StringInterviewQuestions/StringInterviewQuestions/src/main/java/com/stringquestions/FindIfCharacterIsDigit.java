

public class FindIfCharacterIsDigit{

   public static void main(String [] args){
      
      String s = "A1B3H6";

      for(int i = 0; i < s.length(); i++){

          char c = s.charAt(i);

          if(Character.isDigit(c)){
              System.out.println("Digit : " + c);
          }          
      }

   }

}