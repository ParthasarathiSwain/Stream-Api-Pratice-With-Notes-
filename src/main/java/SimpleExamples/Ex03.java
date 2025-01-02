//Question 1: Filter even numbers from a list
package SimpleExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(23,45,44,22,34,67,89,90);
		System.out.println(nums);
		Stream<Integer> stream=nums.stream();
		
//		List<Integer> evenList = stream.filter(num->num%2==0)
//									   .collect(Collectors.toList());
//		System.out.println(evenList);
		
//		or
		 stream.filter(num->num%2==0)
		       .forEach(System.out::println);
		
	}
}
