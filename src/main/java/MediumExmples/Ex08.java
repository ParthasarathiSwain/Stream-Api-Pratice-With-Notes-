//Question 8: Merge two lists and remove duplicates
package MediumExmples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex08 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
		System.out.println(list1+" "+list2);
		List<Integer> mergedList=Stream.concat(list1.stream(), list2.stream())
									   .distinct()
									   .collect(Collectors.toList());
		System.out.println(mergedList);
	}
}
