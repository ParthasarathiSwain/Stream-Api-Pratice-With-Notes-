//Question 6: Find the sum of squares of even numbers
package MediumExmples;

import java.util.Arrays;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(23,-45,44,22,-34,67,-22,44);
		System.out.println(nums);
		int total=nums.stream()
					  .filter(num->num%2==0)
					  .map(num->num*num)
					  .reduce(0,Integer::sum);
		System.out.println(total);
	}
}
