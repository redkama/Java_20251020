package ex13;

public class Student {

	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;

	Student(){
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		int total = kor + eng + math;
		return total;
	}
		
	public float getAverage() {
//		float avg = getTotal() / 3.0f;
		float avg = Math.round(getTotal() / 3.0f*100) / 100.f;
		return avg;
	}
	
		
	public String info() {
		return name + ","+ban+","+no+","+kor+","+eng+","
		+math+","+getTotal()+","+getAverage();
	}
	
	
	
}
