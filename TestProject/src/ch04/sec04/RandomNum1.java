package ch04.sec04;

public class RandomNum1 {

	public static void main(String[] args) {
		// 난수 생성 방법 1 : Math 객체 사용
		// static 객체 Math.random() : 0.0x ~ 0.9x
		// 0 < 랜덤숫자 < 1 실수가 반환됨
		// 자가 기본 객체?
		
		for(int i=1; i<=10; i++) {
			int num = (int)(Math.random()*10)+1;
			System.out.println(num);
		}
		
	}

}
