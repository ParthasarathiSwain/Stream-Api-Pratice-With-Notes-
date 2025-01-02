//Question 2: Find numbers greater than 3
package SimpleExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(2,3,4,22,34,0,1,0);
		System.out.println(nums);
		Stream<Integer> stream=nums.stream();
		
		List<Integer> newNums =stream.filter(num->num>3)
				                     .collect(Collectors.toList());
		System.out.println(newNums);
	}
}
