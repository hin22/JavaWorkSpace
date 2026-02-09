package ch09.sec01;

//smartphone이 반드시 포함해야 하는 기능을 나열 함
public interface ISmartPhone {
	public void sendCall(); //전화걸기
	public void receiveCall(); //전화받기
	public void sendSMS(); //문자전송
	public void receiveSMS(); //문자받기
}
