package ch02.sec01;

public class Final {

	public static void main(String[] args) {
		// 상수 : final 예약어 사용해서 함수 구성
		// final 데이터타입 상수명;
		// 대입 변경이 불가능한? 상수?(대문자로 사용);
		// float : 실수 타입 명
		// 기본적으로 자바는 실수에 해당하는 형태를 double로 보기 떄문에 float 형태를 이용하려면 실수(리터럴) 뒤에 f를 붙여서 실수 타입이라고 알려줘야한다.
		final float PI = 3.14f; //실수 리터럴 뒤에 f 추가하여 float 타입임을 알려줘야 함 없으면 double 타입으로 봄 더블이 플롯보다 크기에 플롯에 더블을 넣을 수 없다 라는 오류
		double radius = 10.0; //실수 뒤에 예약 문자 없으면 dobule 형
		double circleArea = 0; //float은 dobule에 포함 될 수 있기에 오류 x
		
		circleArea = radius * radius * PI;
		
		System.out.println("원의 면적 = "+circleArea);
	}

}
