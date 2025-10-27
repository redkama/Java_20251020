package ex01;

import java.util.Scanner;

public class Chapter4_Ex7 {
	
	public static void main(String[] args) {
		
		/*
		 * int money=0;
      int number=0;
      
      while(true) {
         System.out.println("----------------------------");
         System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
         System.out.println("----------------------------");
         
         Scanner sc = new Scanner(System.in);
         System.out.println("선택> ");
         //키보드 입력한 숫자를 컴퓨터는 문자열로 인식하므로 
         //문자열로 인식된 숫자를  Integer.parseInt 통해서 정수로 변환
         number = Integer.parseInt(sc.nextLine());
         
         // if or switch
         
         switch(number) {
         case 1:
            System.out.println("예금액> ");
            money += Integer.parseInt(sc.nextLine());
            break;
         case 2: 
            System.out.println("출금액> ");
            money -= Integer.parseInt(sc.nextLine());
            break;
         case 3: 
            System.out.println("잔고> ");
            System.out.println(돈);
            break;
         case 4:
            break;
         default:
            System.out.println("1~4까지 정수만 입력해주세요!");               
         }
         
         if(number == 4)   break;
      }
      System.out.println("프로그램 종료!!");
   }
		 */
		
		int money = 0;
		int moneyIn = 0;
		int moneyOut = 0; 
		Scanner sc = new Scanner(System.in);
		
		while (true) {
								
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			String str1 = sc.nextLine();
			
			
			if (str1.equals("1"))
			{
				System.out.print("예금액> ");
				String str2 = sc.nextLine();
				moneyIn = Integer.parseInt(str2);
				
				money += moneyIn;
				System.out.println("잔고> " + money);
			}
			
			else if(str1.equals("2"))
			{
				System.out.print("출금액> ");
				String str2 = sc.nextLine();
				moneyOut = Integer.parseInt(str2);
				
				money -= moneyOut;
				System.out.println("잔고> " + money);
			}
			
			else if(str1.equals("3"))
			{
				System.out.println("잔고> " + money);
			}
			
			else if(str1.equals("4"))
			{
				break;
			}
			
			else 
			{
				System.out.print("1~4까지 정수만 입력해주세요!");
				
			}
						
			
		}
		System.out.print("프로그램 종료");
		
		
	}

}
