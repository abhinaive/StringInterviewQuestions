

public class ConvertStringToUpperCase{

    public static void main(String [] args){

       String s = "Abhinav";
       String upperCased = "";
       for(int i = 0; i < s.length(); i++){

          char c = s.charAt(i);

          if(Character.isLowerCase(c)){
               char d = Character.toUpperCase(c);
               upperCased = upperCased + d;
          }else{
               upperCased = upperCased + c;
          }

       }

       System.out.println("UpperCased String : " + upperCased);

    }  

}