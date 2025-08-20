package StreamApi;
import java.util.List;

/*
 * 
 map()
 ----
 It performs mapping Operation
 It returns new value for each value available in the collection
 The returned Stream object elements type is the returned object but not current Stream element type
 interface Stream<T>{
 	public <R> Stream<R> map(Function <T, ? super R> mapper)
 }
 
 */                                

public class MapMethod {
	public static void main(String[] args) {
		
		List<Object> list=List.of("a","b",23,88,45,"D",90,64);
		System.out.println(list);
		System.out.println();
		
		list.stream()
			.map(ele -> ele.toString()+5)
			.forEach(System.out::println);
		
		//map does not return same type element,it returns different type
		list.stream()          			//Object type ["a","b",23,88,45,"D",90,64]
		.map(ele -> 5)					//Integer type [5,5,5,5,5,5,5,5,5]
		.forEach(System.out::println);   //op : 5 5 5 5 5 5 5 5
		
		//retrive String and print them uppercase
		
		list.stream()
			.filter(ele -> ele instanceof String )
			.map(ele -> ele.toString().toUpperCase())
			.forEach(System.out::print);
		
		System.out.println();
		
		//retrive only integers return those integer as int type values
		
		list.stream()
		.filter(ele -> ele instanceof Integer )
		.map(ele -> (int)ele)
		.forEach(ele-> System.out.print(ele+3 +" "));
		
		System.out.println();
		
		List<Student> stdList=List.of(
				new Student(101,"Partha","Java",5000),
				new Student(102,"Ram","Html",3000),
				new Student(103,"Hari","Css",2000),
				new Student(104,"Asish","React",6000),
				new Student(105,"Laxman","Html",3000),
				new Student(106,"Setu","Java",3000),
				new Student(107,"Kapti","Angular",8000),
				new Student(108,"Nima","Java",2000),
				new Student(109,"Kriti","Angular",4000),
				new Student(110,"Anu","Java",2000)
		);
		//retirve all student name and print
		stdList.stream()
				.map(ele -> ele.getName())
				.forEach(ele -> System.out.print(ele +" "));
		
		System.out.println();
		
		//retirve all student name of Java course and print
				stdList.stream()
						.filter(ele -> ele.getSubject().equalsIgnoreCase("Java"))
						.map(ele -> ele.getName().toString())
						.forEach(ele -> System.out.print(ele +" "));
		
		
		
		
	}
}
