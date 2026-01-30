package ch05.sec03;
import java.util.Scanner;

public class Array2DEx {

	public static void main(String[] args) {
		// 2차원 배열 연습문제1
		Scanner sc = new Scanner(System.in)
				;
		String[][] word = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		for(int i=0; i<word.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? : ", i+1, word[i][0]);
			String answer = sc.next();
			
			if(word[i][1].equals(answer)) {
				System.out.println("정답입니다");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다%n%n", word[i][1]);
			}	
		}
			System.out.println("퀴즈종료");
			sc.close();
	}

}
