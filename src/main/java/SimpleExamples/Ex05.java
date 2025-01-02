//Question 3: Convert a list of names to uppercase
package SimpleExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Asdip","Pushpa","Khusi","Nishi","Partha");
		System.out.println(names);
		Stream<String> stream=names.stream();
		
		List<String> newNames=stream.map(String :: toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(newNames);
	}
}
