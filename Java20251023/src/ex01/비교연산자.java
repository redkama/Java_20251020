package ex01;

import java.util.Scanner;

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

		
		/*
		 * 나이 입력 받아 20 이상이면 성년 출력, 미만이면 미성년 출력
		 
		System.out.println("---------- 삼항연산자(조건연산자) -------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력>>");
		int age = sc.nextInt();
		
		String state = (age>=20) ? "성년" : "미성년";
		System.out.println("당신은 "+ state);
		*/

		
		/*
		 * 정수 입력 받아 2로 나누어 나머지가 0이면 짝수, 아니면 홀수 출력
		 
		System.out.println("---------- 삼항연산자(조건연산자) -------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력>>");
		int num = sc.nextInt();
		
		String state = (num%2) == 0 ? "짝수" : "홀수";
		System.out.println(state);
		*/
		
		
		
		/*
		 * 정수 입력 받아 3으로 나누어 0이면 3의 배수, 1이면 나머지가 1, 2이면 나머지가 2 인 수 라고 출력 
		 */
		System.out.println("---------- 삼항연산자(조건연산자) -------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력>>");
		int num = sc.nextInt();
		
		String state = (num%3) == 0 ? "3의 배수" : (num%3) == 1 ? "3으로 나누어 나머지가 1인 수" : "3으로 나누어 나머지가 2인 수";
		System.out.println(state);
		
				
		
		
		
	}

}
