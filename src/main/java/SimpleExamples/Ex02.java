package SimpleExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		//filter operation
		List<String> names=Arrays.asList("Asdip","Pushpa","Khusi","Nishi","Partha");
		System.out.println(names);
		Stream<String> stream=names.stream();
		
//		stream.filter(name->name.endsWith("i"))
//			  .forEach(System.out::println);
		
//		stream.map(name->name.toUpperCase())
//			  .forEach(System.out::println);
		
//		stream.sorted().forEach(System.out::println);
		
//		List<String> newNames=stream.map(String :: toLowerCase)
//									.collect(Collectors.toList());
//		 System.out.println(newNames);
		
		String reduceName=stream.reduce("",(e,c)->e+" "+c);
		System.out.println(reduceName);
		
	}
}
