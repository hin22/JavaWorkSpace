package ch06.sec05;

public class Calculator {
	
	static double pi = 3.14159; //초기화, static 필드는 생성자 사용하지 않으므로 명시적 초기화를 진행(생성자가 필요없는 변수)
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
}
