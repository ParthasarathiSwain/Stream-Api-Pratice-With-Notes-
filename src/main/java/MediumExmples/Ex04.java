//Question 4: Group elements by their length
package MediumExmples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex04 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Asdip","Pushpa","Khusi","Nishi","Partha");
		System.out.println(names);
		Stream<String> stream=names.stream();

		Map<Integer, List<String>> groupedByLength = stream.collect(Collectors.groupingBy(String::length));
		groupedByLength.forEach((k, v) -> System.out.println(k + ": " + v));
	}
}
