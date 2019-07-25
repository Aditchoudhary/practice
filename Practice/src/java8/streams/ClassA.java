package java8.streams;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.crypto.dsig.CanonicalizationMethod;

import java.beans.PersistenceDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Ankit", 28));
		persons.add(new Person("Adit", 25));
		persons.add(new Person("Satyam", 20));
		persons.add(new Person("Shivam", 18));
		persons.add(new Person("Hritik", 15));
		
		Stream<Person> stream = persons.stream();
		
		Comparator<Person> comparator = Comparator.comparing(Person :: getAge);
		List<Integer> personsfil = new ArrayList<>(); 
		long sum = stream.map(p -> p.getAge())
						   .distinct()
						   .count();
		System.out.println(sum);
	}

}

class Person{
	String name;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
