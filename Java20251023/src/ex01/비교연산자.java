package ex01;

public class 비교연산자 {

	public static void main(String[] args) {

		int numA = 5;
		int numB = 10;
		
		System.out.println(numA == numB);
		System.out.println(numA != numB);
		System.out.println(numA > numB);
		System.out.println(numA < numB);
		System.out.println(numA <= numB);
		
		
		System.out.println("-----------------------");
		String s1 = "korea";
		String s2 = "korea";
		//System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		
		String s3 = new String("korea");
		String s4 = new String("korea");
		// System.out.println(s3 == s4);   false
		System.out.println(s3.equals(s4));
		
		
		System.out.println("---------- 논리연산 -------------");
		int numC = 13;
		int numD = 9;
		
		System.out.println(numA < numB);
		System.out.println(numC < numD);
		
		System.out.println("---------- AND -------------");
		System.out.println( (numA < numB) && (numC < numD) );
		System.out.println( 15 & 12 );
		
		System.out.println("---------- OR -------------");
		System.out.println( (numA < numB) || (numC < numD) );
		System.out.println( 15 | 12 );
		
		System.out.println("---------- XOR -------------");
		System.out.println( (numA < numB) ^ (numC < numD) );
		System.out.println( 15 ^ 12 );
		
		System.out.println("---------- NOT -------------");
		System.out.println( !(6>4) );

		
		
		
		
		
		
		
	}

}
