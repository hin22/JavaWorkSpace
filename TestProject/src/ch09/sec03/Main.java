package ch09.sec03;

public class Main {

	public static void main(String[] args) {
		
		//구현 클래스 객체 생성
		ImplC implc = new ImplC();
		
		implc.methodA();
		implc.methodB();
		implc.methodC();
		
		//인터페이스 참조변수에 c변수 대입
		InterfaceA ia = implc;
		InterfaceB ib = implc;
		InterfaceC ic = implc;
		
		ia.methodA();// super 인터페이스 타입(자신이 생성한 추상메소드만 접근)
		ib.methodB();// super 인터페이스 타입(자신이 생성한 춫상메소드만 접근)
		
		//서브 인터페이스에서는 상속받은 인터페이스의 추상메소드도 접근 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
		ic.methodB();

	}

}
