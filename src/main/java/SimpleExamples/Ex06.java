//Question 4: Count elements in a list
package SimpleExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex06 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Asdip","Pushpa","Khusi","Nishi","Partha");
		System.out.println(names);
		Stream<String> stream=names.stream();
		
		long totalElement=stream.count();
		System.out.println("TotalElement : "+totalElement);
	}
}
