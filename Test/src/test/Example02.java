package test;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {

		/*
		String name = "김영준";
		int age = 43;
		String address = "경기도 남양주시 진업읍 내각리";
		double weight = 80.8; 
		
		System.out.println("------------- 출력 -------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("몸무게 : " + weight + "kg");
		*/


		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름은 : ");
		String name = sc.nextLine();
		
		System.out.print("나이는 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("주소는 : ");
		String address = sc.nextLine();
		
		System.out.print("몸무게는 : ");
		double weight = Double.parseDouble(sc.nextLine());
		
		System.out.println("-------------- 입력값 ----------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("end!!");
		
	}

}
