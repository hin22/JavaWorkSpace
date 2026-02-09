package ch09.sec01;

public class Main {

	public static void main(String[] args) {
		// 인터페이스 활용
		// 두객체는 ISmartPhone 인터페이스를 구현한 구현클래스
		SamsungPhone sp = new SamsungPhone();
		sp.sendCall();
		IPhone ip = new IPhone();
		ip.sendCall();
		
		// 인터페이스 참조변수 (객체)
		ISmartPhone isp = new SamsungPhone(); //구현 메소드 사용 가능
		isp.sendCall();
		
		ISmartPhone iIp = new IPhone();//구현 메소드 사용가능
		iIp.sendCall();
		
		//이렇게도 된다고?
		isp = new IPhone();
		iIp = new SamsungPhone();
	}

}
