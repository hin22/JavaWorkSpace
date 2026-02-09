package exPackage.game_project.start;

import java.util.Scanner;

import exPackage.game_project.info.AppInfo;
import exPackage.game_project.game.*;

public class AppStart {

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		//static이라 바로 호출
		
		while(true) {
			
			System.out.println("*********************");
			System.out.println("★★게임에 오신 것을 환영합니다^^");
			System.out.println("*********************");
			System.out.println("       메뉴      ");
			System.out.println("----------------------");
			System.out.println("1. 애플리케이션 정보");
			System.out.println("2. 가위바위보 게임");
			System.out.println("3. 숫자 알아맞히기 게임");
			System.out.println("4. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : AppInfo.showInfo();break;
				case 2 : GaBaBo.gababoGame();break;
				case 3 : Guess.guessGame();break;
				case 4 : 
					System.out.print("종료 합니다");
					return;
				default : System.out.print("다시 입력해주세요");
			}
			
		}
	}
}
