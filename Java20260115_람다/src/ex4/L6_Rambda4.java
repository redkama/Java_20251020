package ex4;

interface DiscernClass{
	boolean discern(int num);
}


public class L6_Rambda4 {

	public static void main(String[] args) {

//		DiscernClass flag = new DiscernClass() {
//			
//			public boolean discern(int num) {
//				return num % 2 == 0 ? true : false;
//				
//			}
//		};

		DiscernClass flag = num -> num % 2 == 0 ? true : false;
						
		
		boolean f = flag.discern(8);
		if( f == true )
			System.out.printf("짝수");
		else
			System.out.printf("홀수"); 
	}

}
