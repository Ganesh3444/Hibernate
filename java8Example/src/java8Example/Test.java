package java8Example;

public class Test {

	
	public static void main(String[] args) {
		
		int y = 10; int l =15;
		
		MyfunctionalInterface m = (x , x1) -> x*x1;
		
		int k = m.calculate(l, y);
		System.out.println(k);
		
		System.out.println("----------------");
		
		MyfunctionalInterface.m2(); // static method
		m.m1();    // default method
	}
}
