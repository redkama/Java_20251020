package ex4;

import java.util.function.Predicate;

public class L6_Rambda6 {

	public static void main(String[] args) {

		Predicate<Integer> p = num -> num % 2 == 0 ? true : false;
						
		
		boolean f = p.test(7);
		if( f == true )
			System.out.printf("짝수");
		else
			System.out.printf("홀수"); 
	}

}
