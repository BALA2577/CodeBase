package mycodes;

public class StringPalindrome_Reverse {
	public static void main(String[] args) {
		String str = "Race Car";
		//Reversing the string to check Palindrome
		
		str= str.replaceAll("[^a-zA-Z0-9","").toLowerCase();
				
		String reverse ="";
		
		
		for(int i = str.length()-1 ; i >= 0 ; i --) {
			reverse = reverse + str.charAt(i);
		}
		
		boolean isPalindrome = str.equals(reverse);
		
		System.out.println(reverse);
		System.out.println(str);
		System.out.println(isPalindrome);
		
		
	}

}
