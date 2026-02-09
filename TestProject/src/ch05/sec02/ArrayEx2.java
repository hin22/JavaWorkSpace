package ch05.sec02;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 로또번호 랜덤 생성
		int lotto[] = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45)+1;
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("이번 주 로또 번호 ");
		for(int num : lotto) { //num 에 대입
			System.out.print(num + " ");
		}
	}

}
