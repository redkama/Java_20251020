package ex02_2;


/*
 * 싱글톤 - 객체 생성을 1개만 생성해서 공유한다.
 */

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	//생성된 Singleton 객체를 사용(참조)할 수 있는 유일한 통로 역할을한다.
	public static Singleton getInstance() {
		return singleton;
	}
}


class Sample {
	public Sample() {
		
	}
}