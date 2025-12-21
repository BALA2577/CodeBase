package generate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMerge {
	public static void main(String[] args) {
		
		//Merging two lists
		List<Integer> l1 = Arrays.asList(1,24,4,32,2,18,1);
		List<Integer> l2 = Arrays.asList(21,3,5,6,8,3,12);
		
		List<Integer> MergedList = Stream.concat(l1.stream(), l2.stream()).sorted().distinct().collect(Collectors.toList());
		
		
		//logic OuterStream Stream.concat method
		//Inner Stream Stream.concat(l1.stream, l2.stream)
		
		System.out.println(MergedList);
		
		
	}

}
