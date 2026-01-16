package ex4;

@FunctionalInterface
interface StringLength{
	int getLength(String s);
}

//class AAA implements StringLength{
//	
//	@Override
//	public int getLength(String s) {
//		return s.length();
//	}
//}

public class L6_Rambda3 {

	public static void main(String[] args) {

		// StringLength s = new AAA();
		
//		StringLength s = new StringLength(){
//			
//			@Override
//			public int getLength(String s) {
//				return s.length();
//			}
//		};
		
		StringLength s1 = s -> s.length();
				
		int len = s1.getLength("이 문장의 길이는 얼마일까?");
		
		System.out.println(len);

	}

}
