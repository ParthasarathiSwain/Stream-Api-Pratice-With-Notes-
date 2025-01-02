//Question 1: Remove duplicates from a list of integers
package MediumExmples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(23,45,44,22,34,67,22,44);
		System.out.println(nums);
		Stream<Integer> stream=nums.stream();
		List<Integer> unique=stream.distinct().collect(Collectors.toList());
		System.out.println(unique);
	}
}
