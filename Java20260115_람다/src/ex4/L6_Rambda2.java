package ex4;

import java.util.function.BiFunction;

interface Adder{
	int add(int n1, int n2);
}

//class Add implements Adder{
//
//	@Override
//	public int add(int n1, int n2) {
//		return n1+n2;
//	}
//	
//}
//
//public class L6_Rambda2 {
//
//	public static void main(String[] args) {
//
//		Adder a1 = new Add();	
//		
//		int result = a1.add(1, 2);
//		
//		System.out.println(result);
//	}
//
//}

public class L6_Rambda2 {

	public static void main(String[] args) {

		Adder a1 = (n1, n2) -> n1+n2;	
		
		int result = a1.add(1, 2);
		
		System.out.println(result);
		
			
	}

}
