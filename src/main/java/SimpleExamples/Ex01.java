package SimpleExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
	
	public static void main(String[] args) throws IOException {
		//From a Collection
		List<String> names=Arrays.asList("Pradeep","Pushpa","Preeti","Piyali","Partha");
		System.out.println(names);
		Stream<String> stream=names.stream();
		
		
		//From a Array
		int[] numbers= {1,2,3,4,5};
		IntStream intStream=Arrays.stream(numbers);
		
		//Using Stream.of
		Stream s=Stream.of("Pradeep","Pushpa","Preeti","Piyali");
		
		//From Files
		Stream<String> lines = Files.lines(Paths.get("file.txt"));
		
		//Infinite Stream
		Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
	}
}
