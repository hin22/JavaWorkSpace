package ch06.sec01;

public class Car {
	//자동차를 표현하는 클래스
	//클래스의 구성요소
	//멤버필드(속성) : 객체를 표현하는 정보 저장
	String carNo; //main메소드가 아니다 여기는 = "11가1234" 이렇게 값이 들어갈 수 있는공간만 만들어놓으면 누군가가 car객체의 인스턴스를 만들어서 속성들의 값을 넣어줄거고 만든메소드를 호출해서 출력하는 기능을 작업
	String carName;
	String carMaker;
	int carYear;
	int carCC;
	
	//멤버메소드 : 객체의 기능을 표현 //함수를 만든다 public void로 한이유?
	//자동차 정보를 출력하는 메소드 // 왜 public으로 시작했을까? 반환값이 있는 메소드로만들거니까 void?
	public void showCarInfo() { //출력하려는 정보는 위에 있어서 매개변수필요없다?
		System.out.println("차량번호 : " + carNo);
		
	
	}//누군가 이걸 쓰려면 써라 만들었으면 써야한다 어디에서 쓸건지도 정하면된다
}
