package exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDuplicateCheck {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,1,1,3,5,2,1,3,5,6,12,33,4,5);
		
		//The Main idea here is That Set dont allow duplicates
		
		Set<Integer> seen = new HashSet<>();
		
		Set<Integer> duplicates = l1.stream().filter(e->!seen.add(e)).collect(Collectors.toSet());
		
		System.out.println("The Below numbers are duplicated "+ duplicates);
		
		
		
		
	}

}
