package java8StreamCreate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java8Supplier.Test;

public class Demo {
	
	public static final Logger LOGGER = LogManager.getLogger(Test.class);

	public static void main(String[] args) {
		
		// 1st way to create stream
		
		Stream<Integer> intstream = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		intstream.forEach(n -> LOGGER.info(n));
		
		// 2nd way to create stream
		Stream<String> srtStream = Stream.of(new String[] {"abcd","pqrs","xyz"});
		srtStream.forEach(n -> LOGGER.info(n));
		
		// 3rd way to create stream
		List<String> list= new ArrayList<String>();
		list.add("a"); list.add("b");
		list.add("c"); list.add("d");
		
		Stream<String> strstream = list.stream();
		strstream.forEach(n -> LOGGER.info(n));
		
		// 4th way to create stream using generate method
		
		Stream<Integer> intRndomStream = Stream.generate(() -> new Random().nextInt(1000));
		intRndomStream.limit(5).forEach((n) -> System.out.println(n));
		
		System.out.println("*************************************************");
		
		Stream.generate(() -> new Random().nextInt(1000)).limit(6).forEach((n) -> System.out.println(n));
		
		// using iterator method.. stream api
		
		Stream<Integer> intnew = Stream.iterate(3 , i -> i+3);
		intnew.limit(5).forEach((n) -> System.out.println(n));

		// 5th way of create stream using char() method.
		
		IntStream intStream2 = "Abcd_$#%&".chars();
		intStream2.forEach(n -> System.out.println(n));
		
		// using split method ******************************************************************* see
		
		//Stream<String> strstreStream = Stream.of("dog","cat","mouse".split(","));
		//strstreStream.forEach(n -> System.out.println(n));
		
		String input = "dog,cat,bird";
		Stream<String> stream = Arrays.stream(input.split( "," ));
		stream.forEach(System.out::println);
		
		
	}

}