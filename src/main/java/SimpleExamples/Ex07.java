//Question 5: Find the first element in a list
package SimpleExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex07 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Asdip","Pushpa","Khusi","Nishi","Partha");
		System.out.println(names);
		Stream<String> stream=names.stream();
		
//		Optional<String> firstElement=stream.findFirst();
//		if (firstElement.isPresent()) {
//			System.out.println(firstElement);
//		} else {
//			System.out.println("null is there");
//		}
		
		Optional<String> firstElement=stream.findFirst();
		System.out.println(firstElement.orElse("Null Is There"));
	}
}
