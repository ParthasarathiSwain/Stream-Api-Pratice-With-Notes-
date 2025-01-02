//Question 5: Concatenate all strings in a list
package MediumExmples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex05 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Chhimyy","is","a","female","Doggy");
		System.out.println(words);

//		String sentence=words.stream().reduce("",(a,b)->a+" "+b);
//		System.out.println(sentence);
		
		String sentence=words.stream().collect(Collectors.joining(" "));
		System.out.println(sentence);

	}

}
