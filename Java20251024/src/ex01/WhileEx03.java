package ex01;

public class WhileEx03 {

	public static void main(String[] args) {

		int sum=0;
		int i=0;
		
		while(i<100) {
			i++;
			if(i%2 == 0)
				sum += i;
		}
		
		System.out.println("합 : " + sum);
		
	}

}
