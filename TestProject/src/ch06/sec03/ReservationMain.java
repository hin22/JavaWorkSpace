package ch06.sec03;

public class ReservationMain {

	public static void main(String[] args) {
		// 예약 진행
		
		// 매개변수가 있는
		Reservation rsv = new Reservation("KE1001", "홍길동", "인천", "뉴욕", 1600000, "A38");
			rsv.showRsvInfo();
			rsv = null; //예약 취소? 인스턴스 하나를 날리겠다?
			rsv = new Reservation();
			rsv.showRsvInfo();
	}

}
