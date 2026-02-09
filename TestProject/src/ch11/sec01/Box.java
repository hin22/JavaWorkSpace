package ch11.sec01;

//해당 클래스는 Object 객체를 다루는 필드와 메소드가 있음
public class Box {
	//필드 선언 : 타입결정 되어 있지 않음
	//모든 타입을 표현하는 타입(객체) : 자바 Object 클래스를 상속 받아서 구성되어 있음 기본 데이터 타입도 Object가 포함하고 있음
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}
