package ch04.sec02;

public class For {

	public static void main(String[] args) {
		// for 문 예제
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		// 누적연산
		int sum, i;
		sum = 0; //누적연산을 위한 누적변수는 반복 진입전에 초기화되어야 함
		for(i=1; i<=100; i++) { //반복 종료되는 시점의 i값은 조건이 false여야 하므로 >100어야 함 : 101
			sum += i;
		}	
		System.out.println("1~" + i + "합 : " + sum);
		
		
		//증가감 표현 변경
		sum = 0;
		for(i=1; i<=100; i+=2) { //증가감 연산에 간격을 조절할 수 있음
			sum += i; //1~100까지의 합
		}
		System.out.println("1~" + (i-1) + "의 홀수합 : " + sum);
		
		//////////////////////////////
		// 중첩 for 문
		
		for(int m=2; m<=9; m++) {
			System.out.println("*****" + m + "단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + " * " + n + "=" + (m*n));
			}
		}
		
	}

}
