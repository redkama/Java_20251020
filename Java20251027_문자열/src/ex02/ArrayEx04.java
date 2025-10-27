package ex02;

import java.util.Arrays;

/*
 * 정수 배역 5개 생성후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 * 
 * -- 배열 복사
 */

public class ArrayEx04 {

	public static void main(String[] args) {

		int[] numArr = {90, 80, 70, 60, 50, 40, 30, 20, 10, 0, 110, 120};
		
		
		int sum = 0;
		
		for(int i=0; i<numArr.length; i++)
			sum += numArr[i];
		
		System.out.println("총합 : " + sum);	
		
		
		
		System.out.println("Old numArr 길이 : " + numArr.length);
		System.out.println(Arrays.toString(numArr));
		
		int[] temp = new int[15];
		for (int i=0; i<numArr.length; i++)
			temp[i] = numArr[i];
	
		numArr = temp;
		
		System.out.println("New numArr 길이 : " + numArr.length);
		System.out.println(Arrays.toString(numArr));
		
	}
	

}
