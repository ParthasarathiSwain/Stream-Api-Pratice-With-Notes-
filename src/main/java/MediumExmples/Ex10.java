//Question 10: Find the longest string in a list
package MediumExmples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex10 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "stream", "functional", "programming");
		Optional<String> longestWord = words.stream()
		                                    .max(Comparator.comparingInt(String::length));
		System.out.println(longestWord.orElse("No words"));
	}

}
