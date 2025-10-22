package test;

public class Sample {

	public static void main(String[] args) {

		
		System.out.println("Hello, Java");
		System.out.println("Hello, Java");
		
		char var1 = 'A';
//		char c1 = 65;
		char c1 = 0xAC63;
		char var2 = '가';
		char c2 = 44032;
		
		System.out.println(var1);
		System.out.println(c1);
		System.out.println(var2);
		System.out.println(c2);
		
		
		
		float f1 = 10.5f;
		double d1 = 10.5;
		
		System.out.println(f1);
		System.out.println(d1);
		
		
		
		float f2 = 2147483648f;
		float f3 = 2147483658f;
		float f4 = 2147483668f;
			
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		
		
		String str1 = "김영준";
		String str2 = "홍\n길\t동";
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
		// 자동 형변환
		int intA = 10;
		byte byteB = 20;
		
		intA = byteB;
		
		System.out.println(intA);
		System.out.println(byteB);
		
		
		// 강제 형변환
		System.out.println("----------------강제 형변환--------------------------");
		intA = 10;
		byteB = 20;
		byteB = (byte)intA;
	
		System.out.println(intA);
		System.out.println(byteB);

		
		// 실수 형변환
		System.out.println("----------------실수 형변환--------------------------");
		
		double dNum = 20.5;
		int iNum = 10;
		
		dNum = iNum;
		System.out.println("dNum = " + dNum);
		
		dNum = 20.5;
		iNum = (int)dNum;
		System.out.println("iNum = " + iNum);
		
		
		// 정수 나누기
		/* 정수 대 정수 연산 = 정수
		 * 정수 대 실수 연산 = 실수
		 * 실수 대 실수 연산 = 실수
		 * 정수 대 문자열 연산 = 문자열
		 * 실수 대 문자열 연산 = 문자열
		 */
		System.out.println("----------------정수 나누기--------------------------");
		
		int iNum2 = 5;
		int iNum3 = 2;
		
		dNum = iNum2 / iNum3;
		System.out.println("dNum = " + dNum);
		
		dNum = (double)iNum2 / iNum3;
		System.out.println("dNum = " + dNum);
		
		
		/*
		 * 변수명 명명 규칙
		 * 
		 * 나이 : a(X), age(O)
		 * 
		 * 클래스명 기입 -> 사람 클래스 -> Person
		 * 
		 * 변수명, 글래스명 -> 영문대소문자, 숫자, 특수문자( _ , $ ) 조합으로 만들수 있음
		 * 단, 숫자는 맨 앞에 기입할 수 없다. & 예약어는 사용할 수 없다.
		 * 
		 */
		
		
		
		
				
	}

}
