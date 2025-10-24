package ex01;

public class ForEx03 {

	public static void main(String[] args) {

		/*
		 * 초기값, 증가값은 변형 가능
		 */
		
		int sum = 0;
		int i=1;
		
		for( ; i<=100; ) {
			if(i % 2 == 0)
				sum += i;
			
			i++;
		}
			
				
		System.out.println("합 : " + sum);
		
	}

}
