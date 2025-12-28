package mycodes;

public class Palindrome {
	
	public static void main(String[] args) {
		
		
	int number = 1224;	
	int temp = number; //number is to compare // temp is to do the arithmetic
	int rev = 0;
	//checking palindrome
	
	while(temp>0) {
					rev = rev * 10 + (temp%10);
					temp = temp/10;
					}
	
	if(number==rev) {
	System.out.println("Reverse of the number is "+rev);
	System.out.println("Actual Number is "+number);
	System.out.println("The given number is a Palindrome");
	}else {
		System.out.println("The given number is not a Palindrome");
	}
	}

}
