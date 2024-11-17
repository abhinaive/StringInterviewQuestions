
public class MultiplyNumberInGivenStrings{

   public static void main(String [] args){

       String num1 = "123";
       String num2 = "456";
       int [] result = new int[num1.length() + num2.length()];

       int i = num2.length() - 1;
       int powerFactor = 0;

       while(i >= 0){

             int vali = num2.charAt(i) - '0';
             i--;

             int j = num1.length() - 1;
             int k = result.length - 1 - powerFactor;
             int carry = 0;

             while(j >= 0 || carry != 0){

                 int valj = j >=0 ? num1.charAt(j) - '0' : 0;
                 j--;
                    
                 int product = vali*valj + carry + result[k];    
 
                 result[k] = product % 10;
                 carry = product / 10;
                 k--;

             }

             powerFactor++;
       }

       String str = "";
       boolean flag = false;

       for(int val : result){
        
            if(val == 0 && flag == false){

            }else{
                flag = true;
                str += val;
            }
       }

       System.out.println(str);
   }

}