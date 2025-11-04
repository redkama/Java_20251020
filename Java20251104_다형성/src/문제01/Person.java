package 문제01;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("이름: "+name+", 나이: "+age);
	}
/*	
	public void showInfo(String name, int age) {
		System.out.println("이름: "+name+", 나이: "+age);
	}
*/
}
