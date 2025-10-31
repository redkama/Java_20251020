package ex01;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("new Person");
	}

	public void eat() {
		System.out.println(name + "은 점심을 먹는다.");
	}

	@Override  // @ 어노테이션, 검증장치 -> 상위클래스가 가지고 있는 메소드를 재정의
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
//	public String toString() {
//		return "이름 : "+name+", 나이 : "+age;
//	}

}
