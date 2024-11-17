
public class ChangeCaseOfGivenString{

    public static void main(String [] args){

        String s = "abhinav PRASAD";
        String n = "";

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            if(Character.isUpperCase(c)){
               n = n + Character.toUpperCase(c);
            }else if(Character.isLowerCase(c)){
               n = n + Character.toUpperCase(c);
            }else if (Character.isWhitespace(c)){
               n = n + c;
            }               
        }

        System.out.println(n);
    }

}