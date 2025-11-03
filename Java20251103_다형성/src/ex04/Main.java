package ex04;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		a.test();   //  A function
		
		a = new B();
		a.test();   //  B function 
		
		a = new C();
		a.test();  //  C function
		
		System.out.println("------------------");
		
		a = new B();
		//B b = new A();     오류 -> 하위클래스는 상위클래스를 참조할 수 없음		
		B b = (B)a;
		b.test();  // B function
		
		System.out.println("------------------");
		
		a = new C();
		C c = (C)a;
		c.test();  //  C function
	
		System.out.println("------------------");
		
		A aa = null;
		
		C cc = new C();
		

		
		
		
		

	}

}
