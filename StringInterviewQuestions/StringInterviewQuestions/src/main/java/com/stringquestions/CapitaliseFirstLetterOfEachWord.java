
public class CapitaliseFirstLetterOfEachWord{

    public static void main(String [] args){

             String s = "silly squirrels scampered across the sunny street";
         String m = s + " "; 
         String w = "";
         String n = "";

         for(int i = 0; i < m.length(); i++){

             char c = m.charAt(i);

             if(c != ' '){
                w = w + c;
             }else{

                char l = w.charAt(0);
                char u = Character.toUpperCase(l);
                n = n + u + w.substring(1)  + " ";
                w = "";
             }

         }
         
         System.out.println(n);
    }

}
