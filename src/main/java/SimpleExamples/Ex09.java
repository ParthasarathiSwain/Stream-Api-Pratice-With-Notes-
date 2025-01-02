//Question 7: Sum of all numbers in a list
package SimpleExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex09 {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(23,45,44,22,34,67,89,90);
		System.out.println(nums);
		Stream<Integer> stream=nums.stream();
//		Optional<Integer> totalSum=stream.reduce((total,num)->total+=num);
//		System.out.println(totalSum);
		int total=stream.reduce(0,Integer::sum);
		System.out.println(total);
		
		
	}
}
