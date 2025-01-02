//Question 2: Check if all elements in a list are positive
package MediumExmples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(23,-45,44,22,-34,67,-22,44);
		System.out.println(nums);
		Stream<Integer> stream=nums.stream();
		boolean res=stream.allMatch(num->  num > 0); 
		System.out.println(res);
		
	}

}
