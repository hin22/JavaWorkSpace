package ch09.sec02;

public interface RemoteControl {
	//상수필드 선언 : 인터페이스의 멤버필드는 public static final이 컴파일 될 때 자동 삽입
	//필드 구성하면 static 상수로 구성됨
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 선언 : abstract 생략해도 추상메소드로 자동 처리 됨
	//메소드 원형만 표현
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 선언 : 실행 블럭이 있느 ㄴ메소드(구현 클래스가 소유하게 되는 메소드)
	//default 키워드 반드시 필요  default
	//접근제한자 생략하면 public 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다");
		}else {
			System.out.print("무음 해제 합니다");
		}
	}
	
	//정적 메소드 선언 : 인터페이스 통해 호출되면 메소드(static)
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
	
}
