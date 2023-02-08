package java8StreamCreate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectMethod {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i<11 ; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer> intlList = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(intlList);
		
		Integer[] intlist1 = list.stream().filter(n -> n%2!=0).toArray(Integer[]::new);
		for (int i = 0; i<intlist1.length; i++) {
			System.out.println(intlist1[i]);	
		}
		
		
	}

}
