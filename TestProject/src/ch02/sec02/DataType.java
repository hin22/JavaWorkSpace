package ch02.sec02;

public class DataType {

	public static void main(String[] args) {
		// DataType
		// 기본 타입(정수/실수/문자/논리)
		// 정수 타입 : byte/short/int/long
		// 실수 타입 : float/double
		// 문자 타입 : char
		// 논리 타입 : boolean
		// 데이터 타입에 따라 사용하는 메모리 크기가 다름
		// 메모리 크기 최소단위 : bit (0또는 1저장)
		// bit가 8개가 모여 byte 단위 : 8개의 0또는 1을 저장함
		// byte : 데이터를 처리하는 최소 단위 -> 256개의 데이터 표현
		
		//////////////////////////////////////
		// 문자형 (char)
		char a = 'A';
		char b = '\u0041';
		char c = 65;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
				
		//////////////////////////////////////
		// int - 4byte 정수 값을 표현
		// 정수의 기본 타입
		int num = 10; //리터럴에 정수 표현 기호가 필요 없음
		
		
		//////////////////////////////////////
		// long : 8byte 정수 값을 표현
		
		long num2 = 10; //int 타입의 리터럴을 long 형 변수에 저장(작은 타입이 큰 타입으로 저장)
		//long longValue = 1000100100100; //리터럴 int 형인데 표현 범위를 벗어남 오류
		long longValue = 100100100100L; //L 또는 l 을 표현해서 long 형 리터럴이다 라고 알려줘야한다
		
		System.out.println("====================");
		byte byteValue = 10; //1byte 정수 00000110 을 이진수로 10만 출력?
		short shortValue = 1000; //2byte 정수
		int intValue = 2100100100; //4byte 정수
		long longVal = 100010001000100L;
		
		System.out.println(byteValue);
		
		//////////////////////////////////////
		// 실수타입
		// float : 리터럴 사용 시 f
		// double : 실수의 기본 타입
		//
		
		float average = 88.5f;
		double doubleValue = 0.1234567890123456789;
		float floatValue = 0.1234567890123456789f;
		
		System.out.println("====================");
		System.out.println(doubleValue); //dobule 타입이 더 정밀함
		System.out.println(floatValue);	//
		
//		////////////////////////////////////
		// 지수 표현 하기
		// e 기호 사용
		// 가수부e지수부
		int var1 = 3000000;
		double var2 = 3e6; //3e뒤에 0 6개? 정수부분을 표현하고 e(지수) 뒤에 6을 포현
		float var3 = 3e6f; // f는 float의 f
		double var4 = 3e-6; //소수점이하 6자리
		double var5 = 3e-2; //소수점이하 6자리
		
		System.out.println("====================");
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4); //println문의 포맷을 변경하지 않으면 소수점 이하가 길면 지수표현 사용
		System.out.println(var5);
		
		
		// 참조형(기본타입만으로 표현이 어려워서 추가 된 타입(객체) : String
		// 기본타입인 것 처럼 사용되지만 참조타입이다 String 예약어이며 객체이고 클래스?
		String name = "홍길동";
		
		// "홍길동"은 문자열형 리터럴
		// name은 문자열형 변수임
		System.out.println(name);
		
	}

}
