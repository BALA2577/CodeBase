package generate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsMax {
	public static void main(String[] args) {
		
		List <String> fruitnames = Arrays.asList("Apple","fig","Pineapple","Watermelon","Mango");
		
		Optional<String> Maxfruit = fruitnames.stream().max(Comparator.comparingInt(String::length));
		 
		System.out.println(Maxfruit);
		
		

	}

}
