package StreamApi;

import java.util.List;
import java.util.stream.Stream;

/*
 The filter method is used for filtering(Validating)
 the given collection of object with pased Predicate(Condition)
 interface Stream<T>{
 	public Stream<T> filter(Predicate <? super T> predicate)
 }
Q-1
---
create collection of elements with Strings and integers
retrieve only String Objects and print
 */
public class FilterMethod {
	public static void main(String[] args) {
		//upto java 8 version
		//List list1=Arrays.asList("a","b",23,45,"D");

		//upto java 9 version
		List<Object> list1=List.of("a","b",23,88,45,"D",90,64);
		System.out.println(list1);
		System.out.println();

		//retrieve only String
		list1.stream()
		.filter(ele -> ele instanceof String)
		.forEach(ele ->System.out.print(ele+" "));

		System.out.println();
		//retrieve only Integer
		list1.stream().filter(ele -> ele instanceof Integer)
		.forEach(ele -> System.out.print(ele+" "));

		System.out.println();
		//retrieve only even integer
		list1.stream()
		.filter(ele -> ele instanceof Integer )
		.filter(ele -> (int)ele%2==0 )
		.forEach(ele -> System.out.print(ele+" "));

		System.out.println();
		//retrieve only odd integer
		list1.stream()
		.filter(ele -> ele instanceof Integer)
		.filter(ele -> (Integer)ele%2!=0)
		.forEach(ele -> System.out.print(ele+" "));

		System.out.println();
		//Collection with custom object (student object)
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

		System.out.println();
		//printing all student
		stdList.stream()
		.forEach(std ->System.out.println(std));
		System.out.println("-----------------------------------------------------");
		//retrieve only java Student
		stdList.stream()
		.filter(std -> std.getSubject().equalsIgnoreCase("Java"))
		.forEach(std -> System.out.println(std));

		System.out.println("-----------------------------------------------------");

		//retrieve only java Student who paid less than 5000
		stdList.stream()
		.filter(std -> std.getSubject().equalsIgnoreCase("Java") && std.getFee()<5000)
		.forEach(std -> System.out.println(std));

		System.out.println("-----------------------------------------------------");

	}
}
