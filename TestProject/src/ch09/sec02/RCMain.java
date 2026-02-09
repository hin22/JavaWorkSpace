package ch09.sec02;

public class RCMain {

	public static void main(String[] args) {
		// 인터페이스 참조 변수 : 다형성
		RemoteControl rc = null;

		// TV 객체를 인터페이스 참조 변수 대입
		rc = new TV();
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.turnOff();
		
		TV tv = new TV();
		tv.turnOn();
		tv.setVolume(-50);
		tv.setMute(true);
		tv.setMute(false);
		tv.turnOff();
		
		
		//정적 메소드 사용
		RemoteControl.changeBattery();
		
		rc = new Audio();
		rc.setMute(true);
		rc.setMute(false);
		
		//다중 인터페이스 구현 클래스
		ISearchable sb = null;
		rc = new SmartTelvision();
		
		sb = new SmartTelvision();
		
		rc.turnOff();
		
		//접근 가능 메소드
		//rc 인터페이스에 포함된 추상메소드와 default만 접근 가능함
		//search() 는 다른 인터페이스 추상메소드기 때문에 접근 불가능
		//rc.search("bbbb");
		sb.search("www.naver.com");
		//sb.turnOff();
		rc.setMute(false);
		
		
	}

}
