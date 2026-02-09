package ch06.sec03;

public class Reservation {
	// 멤버변수(클래스 내부 전역변수)
	// 밑 매개변수로 받은 Reservation 보존을 위한
	String flight, name, departure, arrival, seatNo;
	int price;
	
	// 생성자 함수 오버로딩
	// 생성자 함수 : 인스턴스 생성 시 단 한번 호출, 객체 구성 용도, 개발자 입장 - 초기화 목적
	// 기본생성자 함수 : 명시적 생성자 함수가 없으면 자동 삽입됨, 명시적 생성자 함수가 하나라도 있으면 자동 삽입이 안됨
	// 
	public Reservation() { //빈 객체 생성 용도 - 기본 생성자 함수
		//만약 이 빈 객체 생성 용도인 이 생성자가 없으면 밑에 명시적 생성자가 있어도 main에서 객체 생성할 수 없다..?? 그래서 이것도 같이 밑에와 있어야한다?
	}
	
	// 지역변수(매개변수)
	public Reservation(String flight, String na, String dpt, String arv, int p, String s) {
		//flight = flight; //대입연산의 효과가 없음 지역변수(멤버변수 flight이 아닌 멤버변수 flight으로 인식 이럴 떄 사용하는 것이 참조가 this참조
		this.flight = flight; //매개변수 flight으로 인식 함
		name = na;
		departure = dpt;
		arrival = arv;
		price = p;
		seatNo = s;
	}
	
	public void showRsvInfo() {
		System.out.println("**항공권 예약 정보**");
		System.out.println("항고기 : " + flight);
		System.out.println("예약자 : " + name);
		System.out.println("출발지 : " + departure);
		System.out.println("도착지 : " + arrival);
		System.out.println("금액 : " + price);
		System.out.println("좌석번호 : " + seatNo);
	}
}
