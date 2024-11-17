
public class RemoveWhiteSpacesInAString{

   public static void main(String [] args){

      String s = " ABHI  NAV  PRA SAD ";
      String n = "";

      for(int i = 0; i < s.length(); i++){
       
         char c = s.charAt(i);
          
         if(!Character.isWhitespace(c)){
             n = n + c;
         }

      }
   
      System.out.println(n);
 
   }

}