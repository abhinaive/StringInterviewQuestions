

public class StringEncodingPiglatin{

   public static void main(String [] args){

       String s = "CLEAR";  // EAR + CL + WAY
    // String s = "EAT";    // EAT -> EAT + WAY
       String n = "";

       for(int i = 0; i < s.length(); i++){
      
           char c = s.charAt(i);

           if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                if(i == 0){
                    n = s + "WAY";    
                }else{
                    n = s.substring(i-1) + s.substring(0,i-1) + "WAY";
                }
                
           }

       }
       
       System.out.println(n);

   }

}