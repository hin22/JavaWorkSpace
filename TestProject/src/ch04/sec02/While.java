package ch04.sec02;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// while 문 정리
		
		/*
		 * while(1==1) {
		 *  //무한 반복
		 * 
		 */
		
		int i, sum;
		i = 0; //초기화 없이 비교 연산 불가능
		sum = 0;
		while(i<=100) { //짝수의 합
			sum += i;
			i+=2;
		}
		System.out.print("i값 : " + i + " sum값 : " + sum);
		
		////////////////////
		//
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("숫자입력 : ");
		num = sc.nextInt();
		
		while (num != 7) { //입력 값이 7이 아닌동안 반복
			System.out.print("다시 입력 : ");
			num = sc.nextInt();
		}
		System.out.print("7 입력. 종료");
		sc.close();
	}

}
