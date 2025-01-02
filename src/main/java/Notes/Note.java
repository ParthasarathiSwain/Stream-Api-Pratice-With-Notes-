/*
Java 8 Stream API - Overview and Topics
---------------------------------------
The Stream API in Java 8 is a powerful tool introduced to perform functional-style operations on 
collections of data. 
It makes it easier to process data in a declarative way (similar to SQL or functional programming).

Key Topics in Stream API
------------------------
	1-> What is a Stream?
	2-> Creating Streams
	3-> Intermediate Operations
	4-> Terminal Operations
	5-> Short-circuiting Operations
	6-> Parallel Streams
	7-> Stream Examples
	
	What is a Stream ?
	------------------
	-> A Stream is a sequence of elements from a data source (e.g., collection, array) 
	   that supports aggregate operations.
	-> Streams don’t modify the source; they produce a result or a new stream.
	-> Streams are lazy (operations are executed only when required).
	-> Streams can be finite (bounded) or infinite (unbounded).
	Advantages of Stream API
	------------------------
	-> Clean and Concise Code: Operations are expressive and easier to understand.
	-> Lazy Evaluation: Improves performance by avoiding unnecessary computations.
	-> Parallel Processing: Leverages multi-core processors for faster processing.
	-> Supports Functional Programming: Enables operations like map-reduce.
	
 	Creating Streams
 	----------------
 	//from collection
  		List<String> names=Arrays.asList("Pradeep","Pushpa","Preeti","Piyali","Partha");
		System.out.println(names);
		Stream<String> stream=names.stream();
		
	//from Array
	 int[] numbers = {1, 2, 3, 4, 5};
	 IntStream intStream = Arrays.stream(numbers);
	 
	//Using Stream.of
	Stream s=Stream.of("Pradeep","Pushpa","Preeti","Piyali");
		
	//From Files
	Stream<String> lines = Files.lines(Paths.get("file.txt"));
		
	//Infinite Stream
	Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
	 
	Intermediate Operations
	-----------------------
	Intermediate operations transform a stream and return another stream. 
	These operations are lazy.
	
	Common Intermediate Operations:
		- filter: Filters elements based on a condition.
		- map: Transforms elements.
		- sorted: Sorts elements.
		- distinct: Removes duplicates.
		- limit: Limits the number of elements.
		- skip: Skips the first N elements.
	Example
	-------	
		List<String> names=Arrays.asList("Asdip","Pushpa","Khusi","Nishi","Partha");
		System.out.println(names);
		Stream<String> stream=names.stream();
		
//		stream.filter(name->name.endsWith("i"))
//			  .forEach(System.out::println);
		
//		stream.map(name->name.toUpperCase())
//			  .forEach(System.out::println);
		
		stream.sorted().forEach(System.out::println);
		
		Terminal Operations
		----------------------
		Terminal operations produce a result or a side effect and consume the stream.
		
		Common Terminal Operations:
		--------------------------
			- forEach: Iterates over elements.
				List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
				names.stream().forEach(System.out::println);
				
			- collect: Collects elements into a collection.
				List<String> newNames=stream.map(String :: toLowerCase)
									.collect(Collectors.toList());
		 		System.out.println(newNames);
		 		
			- reduce: Reduces elements to a single value.
				String reduceName=stream.reduce("",(e,c)->e+" "+c);
				System.out.println(reduceName);
		
			- count: Counts the number of elements.
			- anyMatch/allMatch/noneMatch: Checks conditions.
 */


