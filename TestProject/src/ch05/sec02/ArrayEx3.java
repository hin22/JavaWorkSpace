package ch05.sec02;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 배열 연습문제4
		// 0~9까지의 랜덤 숫자 10개 생성해서 배열에 저장하고
		// 각 숫자의 반복 횟수 출력
		
		int num[] = new int[10];
		int count[] = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 10);
			System.out.print(num[i]);
			
			count[num[i]]++; //num idx를 카운트
		}
		
		System.out.println();
		
		for(int i=0; i<num.length; i++) {
			System.out.println(i + "의 개수" + count[i]);
		}
		
		
		
		

	}

}
