package ex04;

public class VariableExchangeExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		//before
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		//Exchange 두 수 변경
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		
		
		byte var1 = 127;
		var1 += 1;
		
		System.out.println(var1);
		
		byte var2 = -128;
		var2 -= 1;
		
		System.out.println(var2);
		
	}

}
