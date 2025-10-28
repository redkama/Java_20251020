package ex03;

import java.util.Arrays;

/*
 * 로또 프로그램
 * 배열 : 6칸짜리 int 배열
 * 로또는 1~45 랜덤하게 저장
 * 단, 중복 불가
 */

public class LottoEx03 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		for (int i=0; i<lotto.length; i++) {
			
			// 1~45까지 랜덤숫자 생성
			int temp = (int)(Math.random()*45)+1;
			
			lotto[i] = temp;
			
			// 중복 체크
			for(int j=0; j<i; j++) {
				if(temp == lotto[j]) {
					i--;
					break;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(lotto));
		
		
	}

}
