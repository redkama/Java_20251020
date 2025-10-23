package ex01;

public class if조건문06 {

	public static void main(String[] args) {

		/*
		 * 버스 요금 계산표
		 * 요금 : 2000
		 * 65세이상 : 무료
		 * 20 ~ 64 : 할인율 0%
		 * 15 ~ 19 : 할인율 20%
		 * 7 ~ 14 : 할인율 50%
		 * 6세미만  : 무료
		 * 
		 * 출력 예시
		 * 나이 XX세는 요금 XX원 입니다.
		 */
/*
		int age = 15;
		int price = 2000;
		
		if(age >= 65) {
			System.out.println("나이 " + age + "세는 요금이 무료 입니다.");
		}
		
		else if(age >= 20) {
			System.out.println("나이 " + age + "세는 요금 " + price +"원 입니다.");
		}
		
		else if(age >= 15) {
			System.out.println("나이 " + age + "세는 요금 " + (int)(price - (price * 0.2)) +"원 입니다.");
		}
		
		else if(age >= 7) {
			System.out.println("나이 " + age + "세는 요금 " + (int)(price - (price * 0.5)) +"원 입니다.");
		}
		
		else {
			System.out.println("나이 " + age + "세는 요금이 무료 입니다.");
						
		}
		
			
					
		System.out.println("------------프로그램 종료------------");
	}
*/
		
		int age  = 17;    //나이
		int fee = 2000;   //요금
		double rate = 0;  //할인율
		
		if(age>=65) {
			fee = 0;
		}else if(age>=20) {
			rate = 0;
		}else if(age>=15) {
			rate = 0.2;
		}else if(age>=7) {
			rate = 0.5;
		}else {
			fee = 0;
		}
		
		if(fee != 0) {
			fee = (int)(fee * (1 - rate));			
		}
		
		System.out.println("나이 " + age + "는 " + fee+"요금 입니다.");
				
		System.out.println("------프로그램 종료--------");
				
		
	}

}
