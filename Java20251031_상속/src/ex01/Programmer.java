package ex01;

public class Programmer extends Person{
	
//	private String name;
//	private int age;
	private String language;
	
	public Programmer() {
	}
	
	public Programmer(String name, int age, String language){
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.language = language;
		System.out.println("new Programmer");
	}

	public void code() {
		System.out.println(language + " 언어로 코딩 중입니다.");
	}

}
