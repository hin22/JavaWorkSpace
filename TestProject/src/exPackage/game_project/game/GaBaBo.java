package exPackage.game_project.game;

import java.util.Scanner;

public class GaBaBo {
	public static void gababoGame() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n\n\n\n가위바위보 게임\\n\\n\\n\\n\\n");
		System.out.println("가위 바위 보 게임 : 1. 가위, 2. 바위, 3. 보");
		System.out.println("====================================");
		
		
		// while() 게임 전체 반복 n누르기 전 까지
		while(true) {
			System.out.print("번호 입력 : ");
			int myNum = sc.nextInt();
			
			int comRan = (int)(Math.random()*3)+1;
			
			//if 비교
			if(myNum == comRan) {
				System.out.println("비겼습니다!");
			}else if((myNum == 1 && comRan == 3) || (myNum == 2 && comRan == 1) || (myNum == 3 && comRan == 2)) {
				System.out.println("당신이 이겼습니다 ^^");
			}else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
			
			//컴퓨터 정보
			String comName = ( comRan == 1) ? "가위" : (comRan == 2) ? "주먹" : "보" ;
			System.out.println("컴퓨터는 " + comName);
			
			//게임 계속 진행여부
	        System.out.print("계속하시겠습니까? (y/n) : ");
	        String retry = sc.next();
	        if (retry.equalsIgnoreCase("n")) {
	            System.out.println("게임을 종료합니다.");
	            break; // while문을 빠져나가서 메인 메뉴로 돌아감
	        }
		}
		
	}
}
