package generate;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int number =11;
		int count = 0;
		
		for(int i = 1 ; i < number ; i ++ ) {
			if(number % 2 != 0 ) {
				count ++;
			}
		}
			
		
		if(count > 1) {
			System.out.println("The Given Number is "+number+ " and its a Prime Number");
		}else
			System.out.println("The Given Number is "+number+ " and its not a Prime Number");
	}

}
