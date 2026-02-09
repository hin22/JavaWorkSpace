package ch08.sec09;

public class SamsungPhone implements ISmartPhone {

	String name;
	
	public SamsungPhone() {
		name = "삼성폰";
	}
	
	@Override
	public void sendCall() {
		System.out.print(name + "으로 전화를 겁니다");
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	} //implements 이 ISmartPhone 인터페이스에 있는 기능을 구현해야한다라고 말한다 

}
