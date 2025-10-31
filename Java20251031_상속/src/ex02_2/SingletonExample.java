package ex02_2;

public class SingletonExample {

	public static void main(String[] args) {

//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1.equals(obj2)) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		
		Sample sam1 = new Sample();
		Sample sam2 = new Sample();
		
		if(sam1 == sam2) {
			System.out.println("같은 Sample 객체입니다.");
		} else {
			System.out.println("다른 Sample 객체입니다.");
		}
	}

}
