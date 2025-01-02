//Question 8: Skip the first 2 elements
package SimpleExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex10 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Asdip","Pushpa","Khusi","Nishi","Partha");
		System.out.println(names);
		Stream<String> stream=names.stream();
		
		stream.skip(2).forEach(System.out::println);
	}
}
