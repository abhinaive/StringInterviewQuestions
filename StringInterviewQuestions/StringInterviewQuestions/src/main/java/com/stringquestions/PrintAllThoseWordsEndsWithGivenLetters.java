
public class PrintAllThoseWordsEndsWithGivenLetters{

    public static void main(String [] args){

        String s = "A RED SEED SAY MY NAME RENEGADE";
        String m = s + " ";
        String w = "";

        for(int i = 0; i < m.length(); i++){

            char c = m.charAt(i);

            if(c != ' '){
                w = w + c;
            }else{

                if(w.endsWith("ED")){
                    System.out.println(w);
                }

                w = "";
            }
        }
    }
}