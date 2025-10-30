package ex13;

public class StudentMain {

	public static void main(String[] args) {

		Student s1 = new Student("김영준", 3, 120, 97, 83, 74);
		
		System.out.println("total: " + s1.getTotal());
		
		System.out.println(String.format("avg: %.2f", s1.getAverage()));
//		System.out.println("avg: " + s1.getAverage());
		
		
		System.out.println(s1.info());
	}

}
