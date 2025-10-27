package ex01;

public class CharAtEx01 {

	public static void main(String[] args) {

		String subject = "자바 프로 그래밍";
		
		// 문자열에서 특정 문자 추출
		char charValue = subject.charAt(3);
		System.out.println(charValue);
		
		//문자열 길이
		int len = subject.length();
		System.out.println("문자열 길이 : " + len);
		
		
		System.out.println("----문자열 대체(변경)-----");
		System.out.println("before: " + subject);
		// 문자열 대체
		subject = subject.replace("자바", "파이썬");
		System.out.println("after: " + subject);

		
		System.out.println("----문자열 잘라내기-----");
		// index 4번째 위치부터 전부다 문자 추출
		String sub2 = subject.substring(4);  
		System.out.println(sub2);
		
		// index 4번째 ~ 6번째 전까지 문자 추출
		String sub3 = subject.substring(4,6);  
		System.out.println(sub3);
		
		
		System.out.println("----문자열 찾기-----");
		// 특정 문자가 있는 위치
		// 해당 문자가 없을 경우, -1 의 값을 가진다.
		int index = subject.indexOf("그");
		System.out.println("문자열 찾기 : "+ index);
		
		
		System.out.println("----문자열 분리-----");
		// 특정 문자를 기준으로 문자열을 분리
		String[] sub4 = subject.split(" ");
		System.out.println(sub4[0]);
		System.out.println(sub4[1]);
		System.out.println(sub4[2]);
		
		
		System.out.println("----문자열 합치기-----");
		String s = "대한";
		String s2 = "민국";
		// 문자열 합치기
		String s3 = s.concat(s2);
		System.out.println(s3);
				
		
	}

}
