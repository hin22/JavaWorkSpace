package ch08.sec04;

public class SuperAirplane extends Airplane {
	//상수?
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	
	// ctrl + space 하고 fly() 상속 오버라이딩?
	@Override
	public void fly() {
		// flyMode에 따라 비행을 결정
	
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다");
		}else {
			super.fly();//재정의 되었지만 부모 클래스 메소드 호출가능(su
			
		}
	}
	
}
