package exercise;

import java.util.Arrays;
import java.util.List;

public class StreamMaps {
	
	public static void main(String[] args) {
		
		List<String> namelist = Arrays.asList("Kumar","Mani","Vijay");
		
		namelist.stream()
		.map(n->n.toUpperCase())
		.forEach(System.out::println);
		//Maps are used to transform one form to other form in this case
		//we are transforming the normal letters to uppercase letters
		
		namelist.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
