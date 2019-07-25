package java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHighest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,3,4,5,2,8,9,3,6,10,23,2,5,24,24);
		 
		Optional<Integer> value = list.stream()
		                            .sorted(Collections.reverseOrder())
		                            .distinct()
		                            .limit(2)
		                            .skip(1)
		                            .findFirst();
		 
		System.out.println(value.get());

	}

}
