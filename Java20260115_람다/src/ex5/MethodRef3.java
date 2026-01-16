package ex5;

import java.util.function.Function;
import java.util.function.Predicate;

/*
 * 객체 메소드참조 or 매개변수 메소드참조
 */

public class MethodRef3 {
	
	public static void main(String[] args) {
	
		Predicate<String> p = s -> s.isEmpty();
		
		System.out.println(p.test("") );
		System.out.println(p.test("a") );

		
		Predicate<String> p2 = String::isEmpty;
		
		System.out.println(p2.test("") );
		System.out.println(p2.test("a") );
		
		
		
		Function<String, Integer> f1 = f -> f.length();
		System.out.println(f1.apply("car"));
		
		Function<String, Integer> f2 = String::length;
		System.out.println(f2.apply("car"));
	}
	
}
