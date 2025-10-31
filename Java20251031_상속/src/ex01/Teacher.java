package ex01;

public class Teacher extends Person{
	
//	private String name;
//	private int age;
	private String subject;
	
	public Teacher() {
	}
	
	public Teacher(String name, int age, String subject){
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.subject = subject;
		System.out.println("new Teacher");
	}

	public void teach() {
		System.out.println(subject + "를 가르칩니다.");
	}
	
		
}
