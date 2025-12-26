package exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCheckPractice2 {
	
	public static void main(String[] args) {
		
		List<Integer> numberlist = Arrays.asList(1,2,1,2,3,1,2,3,44,5,3,2,4,6);
		
		Set<Integer> seen = new HashSet<>();
		
		Set<Integer> findduplicates = numberlist.stream().filter(e->!seen.add(e)).collect(Collectors.toSet());
		
		System.out.println(findduplicates);
		
//		//to Find duplicates
//		Create a Hashset
//		Since Set doesnt accept duplicates
//		try to add the values inside the set  logic: list.stream().filter(e->!seen.add(e))
//		set will not accept duplicates
//		add the not added to an another set
		
	
		
	}

}
