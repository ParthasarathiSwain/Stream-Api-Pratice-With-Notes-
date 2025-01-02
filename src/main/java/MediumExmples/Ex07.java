//Question 7: Find the first string starting with 'J'
package MediumExmples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex07 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Python", "JavaScript", "Ruby");
		Optional<String> firstJ = words.stream()
		                               .filter(word -> word.startsWith("J"))
		                               .findFirst();
		System.out.println(firstJ.orElse("Not found"));

	}

}
