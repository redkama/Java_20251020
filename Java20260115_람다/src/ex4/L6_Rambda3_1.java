package ex4;

import java.util.function.Function;

public class L6_Rambda3_1 {

	public static void main(String[] args) {

		Function<String, Integer> s1 = s -> s.length();
				
		int len = s1.apply("이 문장의 길이는 얼마일까?");
		
		System.out.println(len);

	}

}
