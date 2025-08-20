package StreamApi;

import java.util.Arrays;
import java.util.List;

/*
 flatMap() for flatterning purpose
 making level or smooth
 Making a multi dimentional array as one dimentiona
 menas it mergs all child array into one 
 
 Ex 
 --
 [[a,b],[c,d],[e,f]]
 		
 [a,b,c,d,e,f] //flattening
 */
public class FlatMapMethod {
	public static void main(String[] args) {
		List<String[]> stringArrayList=
				List.of(
						new String[] {"a","b"},
						new String[] {"c","d"},
						new String[] {"e","f"}
						);
		System.out.println(stringArrayList);
		
		List<String> resList=stringArrayList.stream()
			.flatMap(sa ->Arrays.stream(sa))
			.toList();
		System.out.println(resList);
	}
}
