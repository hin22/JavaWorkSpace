package ch07.sec01;

//public class Add 이러면 Add 오류 MultiClass에서 동일한 이름의 클래스가 이미 있음(접근 제한은 다름)
public class Add { 
	private int a, b;
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void calculator() {
		System.out.println("더하기 : " + (a+b));
	}
}
