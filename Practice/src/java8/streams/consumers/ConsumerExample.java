package java8.streams.consumers;

import java.util.function.Consumer;

public class ConsumerExample {

	
	public static void main(String[] args) {
		Consumer<Integer> yeh = ConsumerExample::processData;
		foo(yeh);
	}
	
	public static void foo(Consumer<Integer> values) {
		values.accept(2);
		System.out.println("Foo ");
	}
	
	public static void processData(int value){
		System.out.println("process data" + value);
	}

}
