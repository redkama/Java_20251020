package ex01;

public class DowhileEx01 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		
		do {
			i++;
			sum += i;
			
		} while(i<10);
		
		System.out.println("합 : " + sum);
		
		
	}

}
