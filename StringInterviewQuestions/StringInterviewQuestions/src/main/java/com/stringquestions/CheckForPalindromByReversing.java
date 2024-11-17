

public class CheckForPalindromByReversing{

    public static void main(String [] args){
      
        String s = "maDAM";
        String p = "";

        for(int i = s.length() - 1; i >= 0; i--){

            char c = s.charAt(i);
            p = p + c;
        }

        if(s.equalsIgnoreCase(p))
           System.out.println("String is Palindrome");
    }

}