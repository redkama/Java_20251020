package 문제01;

public class Student extends Person{
	
	private String schoolName;
	
	public Student() {}
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	
	public void showStudentInfo() {
		super.showInfo();
		System.out.println("학교: "+schoolName);
	}
/*	
	public void showStudentInfo(String name, int age, String schoolName) {
		super.showInfo(name, age);
		System.out.println("학교: "+schoolName);
	}
*/
}
