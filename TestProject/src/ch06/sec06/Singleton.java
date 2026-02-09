package ch06.sec06;

public class Singleton {
	//클래스 멤버필드 생성 (static 생성)
	//singleton 참조변수 : 객체 생성되어 있음. 클래스 명을 통해서 접근 가능
	//필드보호 위해서 private으로 접근 제한
	private static Singleton singleton = new Singleton(); // 클래스 내부에서 객체 인스턴스 하나 생성 내 자신의 해당하는 Singleton이라는 멤버필드에?
	
	//생성자 함수 : Singleton 패턴을 활용할 예정 -> 객체 인스턴스를 한개만 유지되도록 구성
	//private 이므로 외부에서 접근 불가능(생성자 함수 1개) - 클래스 내부에서 접근은 가능
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return singleton; //왜 return 하고 왜 singleton? 왜 대문자아니고
	}
	
}
