package java8Consumer;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		Consumer<Integer > consumer = a -> System.out.println(a);
		
		consumer.accept(15);
		
	
	}

}
