package exPackage.game_project.game;

import java.util.Scanner;

public class Guess {
	public static void guessGame() {
		Scanner sc = new Scanner(System.in);
		
		int comNum = (int)(Math.random() * 10)+1;
				
		System.out.println("***************");
		System.out.println("어떤 숫자일까요? 알아 맞혀보세요^^(1~10");
		System.out.print("숫자 입력 : ");
		
		
		while(true) {
			int userNum = sc.nextInt();
			
			if(userNum == comNum) {
				System.out.printf("드디어 맞혔습니다~ 나의 숫자는 %d입니다%n",comNum);
				break;
			}else {
				System.out.print("아닙니다. 다시 맞혀보세요^^ 다시 입력 : ");
				
			}
		}
	}
}
