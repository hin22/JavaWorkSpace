package ch05.sec02;

import java.util.Scanner;

public class ControlEx2 {

	public static void main(String[] args) {
		// 연습문제
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		boolean bank = true;

		while(bank) {
			
			System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            
			int select = sc.nextInt();
			
			switch(select) {
				case 1 : //예금
					System.out.print("예금> ");
					int deposit = sc.nextInt();
					balance += deposit;
					break;
					
				case 2 : //출금
					System.out.print("출금> ");
					int withDraw = sc.nextInt();
					if(withDraw > balance) {
						System.out.println("잔액이 없습니다");
					}else {
						balance -= withDraw;
					}
					break;
					
				case 3 : //잔고
					System.out.printf("잔고>%d%n ", balance);
					break;
					
				case 4 : //종료
					bank = false;
					break;
				}
			}
			System.out.println("프로그램 종료");
	}

}
