package string_recursion;

public class String_Recursion {

	public static String olympics(String tokyo) {
		if(tokyo.length()==1)
			return tokyo;
		return tokyo.charAt(tokyo.length()-1) + olympics(tokyo.substring(0, tokyo.length()-1));
		
	}
}
