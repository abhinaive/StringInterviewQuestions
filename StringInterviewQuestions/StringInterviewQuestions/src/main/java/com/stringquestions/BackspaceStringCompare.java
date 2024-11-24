


public class BackspaceStringCompare{

    public static boolean stringCompareAfterModification(String t, String s){
        return stringModificationByRemovingCharBeforeHash(t).equals(stringModificationByRemovingCharBeforeHash(s));
    }

    public static String stringModificationByRemovingCharBeforeHash(String str){

        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){

            if(c != '#'){
               sb.append(c);
            }else if(sb.length() > 0){
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();

    }
  
    public static void main(String [] args){

//      String s = "ab##";             
//      String t = "c#d#";"

        String s = "ab#c";
        String t = "ad#c";

        System.out.println(stringCompareAfterModification(t,s));

    }

}