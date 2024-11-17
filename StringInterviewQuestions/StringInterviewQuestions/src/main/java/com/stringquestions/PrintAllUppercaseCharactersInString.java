
public class PrintAllUppercaseCharactersInString{

   public static void main(String [] args){

      String s = "Abhinav Prasad";

      for(int i = 0; i < s.length(); i++){

          char c = s.charAt(i);
         
          if(Character.isUpperCase(c))
             System.out.println(c);
         }
   }

}