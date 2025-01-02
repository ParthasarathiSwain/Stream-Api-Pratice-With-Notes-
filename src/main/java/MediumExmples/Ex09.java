//Question 9: Count the number of odd numbers in a list
package MediumExmples;

import java.util.Arrays;
import java.util.List;

public class Ex09 {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(23,45,46,22,34,67,28,44);
		System.out.println(nums);
		long count=nums.stream().filter(num->num%2!=0).count();
		System.out.println("No Of Odds : "+count);
	}

}
