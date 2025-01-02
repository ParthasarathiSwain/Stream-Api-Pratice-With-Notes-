//Question 3: Find the second largest number in a list
package MediumExmples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(23,45,44,22,34,67,22,44);
		System.out.println(nums);
		Stream<Integer> stream=nums.stream();
		
//		List<Integer> numSorted=stream.sorted().toList();
//		System.out.println(numSorted);
		
		Optional<Integer> numSortedResverse=stream.sorted(Comparator.reverseOrder())
												  .skip(1)
												  .findFirst();
		System.out.println("Second Largest : "+numSortedResverse.orElse(0));
	}
}
