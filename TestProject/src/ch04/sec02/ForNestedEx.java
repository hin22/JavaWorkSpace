package ch04.sec02;

public class ForNestedEx {

	public static void main(String[] args) {
		// 중첩 for 문 연습문제
		
		for(int x=1; x<=9; x++) {
			for(int i=2; i<=9; i++) {
				System.out.print(i + "X" + x + "="+(i*x) + "\t");
			}
			System.out.println();
		}
		//
	}

}
