//Question 6: Find the maximum number in a list
package SimpleExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex08 {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(23,45,44,22,34,67,89,90);
		System.out.println(nums);
		Stream<Integer> stream=nums.stream();
		Optional<Integer> max=stream.max(Integer::compareTo);
		System.out.println(max.orElse(8));
	}
}
