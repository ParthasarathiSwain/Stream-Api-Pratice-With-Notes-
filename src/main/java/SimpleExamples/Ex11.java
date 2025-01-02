//Question 9: Limit to 3 elements
package SimpleExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex11 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Asdip","Pushpa","Khusi","Nishi","Partha");
		System.out.println(names);
		Stream<String> stream=names.stream();
		
		stream.limit(3).forEach(System.out::println);
	}
}
