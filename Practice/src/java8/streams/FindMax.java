package java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMax {

	public static void main(String[] args) {
		List<Integer> ages = Arrays.asList(98,89,97,99,100);
		Stream<Integer> ageStream = ages.stream();
		Optional<Integer> maxAge = ageStream.max(Comparator.naturalOrder());		
		System.out.println(maxAge.isPresent() ? maxAge.get():"Empty");		
	}

}
