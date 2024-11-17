
public class AddDigits{


     public static int addDigitsToFormSigleDigitNumber(int num){

         int addDigitResult = 0;

         while(num != 0){
           
            addDigitResult = addDigitResult  + (num % 10);

            num = num / 10;
         }
         return addDigitResult;
     }
 
     public static void main(String [] args){

           int num = 9876;
           int answer = num;
            
           while(true){

                answer = addDigitsToFormSigleDigitNumber(answer);

                if(answer < 10){
                    break;
                }
           }

           System.out.println(answer);
     }
}