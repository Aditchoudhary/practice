package java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {

		List<Integer> duplicates = Arrays.asList(98,89,97,99,100,56,56);
		HashSet<Integer> hs = new HashSet<>();
		List<Integer> value =  duplicates.stream().filter(i -> !hs.add(i)).collect(Collectors.toList());
		System.out.println(value);

	}

}
