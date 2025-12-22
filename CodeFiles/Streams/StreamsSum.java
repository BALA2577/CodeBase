package exercise;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamsSum {
	
	public static void main(String[] args) {
		
		//Interview problems of SUM, AVERAGE, MIN AND MAX
		
		List <Integer> numberlist = Arrays.asList(1,2,3,4,2,1,4,5,67,3,2);
		
		//sum
		int sumofnumber = numberlist.stream().mapToInt(e->e).sum();
		//average
		double average = numberlist.stream().mapToInt(e->e).average().orElse(0);
		//want all as a stats
		IntSummaryStatistics stats = numberlist.stream().mapToInt(e->e).summaryStatistics();
		
		System.out.println(stats);		
	}

}
