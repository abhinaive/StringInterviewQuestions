package com.stringinterviewproblems;


/*
public class AddTwoStringOfNUmbers {
	
	public static String addTwoStringOfNumbers(String num1, String num2) {
		
		int n1 = num1.length() - 1;
		int n2 = num2.length() - 1;
		int carry = 0;
		
		StringBuilder sb = new StringBuilder();
		
		while(n1 >= 0 || n2 >=0) {
			
			if(n1<0) {
				sb.append((num2.charAt(n2) - '0' + carry)%10 + '0');
				carry = (num2.charAt(n2) - '0' + carry)/10;
				n2--;
			}
			else if(n2<0) {
				sb.append((num1.charAt(n1) - '0' + carry)%10 + '0');
				carry = (num1.charAt(n1) - '0' + carry)/10;
				n1--;
			}
			else {
				
				sb.append((num1.charAt(n1) - '0' + num2.charAt(n2) - '0' + carry)%10 + '0');
				carry = (num1.charAt(n1) - '0'  + num2.charAt(n2) - '0' + carry)/10;
				n1--;
				n2--;
			}
			
		}
			
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		
		String s1 = "123";
        String s2 = "78";
        
        System.out.println("Addition Result : " +  AddTwoStringOfNUmbers.addTwoStringOfNumbers(s1,s2));
	}

}

*/


public class AddTwoStringOfNUmbers {

    public static String addTwoStringOfNumbers(String num1, String num2) {

        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (n1 >= 0 || n2 >= 0 || carry > 0) {

            int x = (n1 >= 0) ? num1.charAt(n1) - '0' : 0;
            int y = (n2 >= 0) ? num2.charAt(n2) - '0' : 0;

            int sum = x + y + carry;

            sb.append(sum % 10);
            carry = sum / 10;

            if (n1 >= 0) n1--;
            if (n2 >= 0) n2--;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        String s1 = "123";
        String s2 = "78";

        System.out.println("Addition Result : " + AddTwoStringOfNUmbers.addTwoStringOfNumbers(s1, s2));
    }
}



