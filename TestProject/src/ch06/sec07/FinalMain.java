package ch06.sec07;

public class FinalMain {

	public static void main(String[] args) {
		// final 사용 예제
		Final fil = new Final("홍길동", "1234");
		fil.name = "김길동";
		//fil.ssn = "5678"; //ssn 상수이므로 대입연산 불가능 함
		
		System.out.println(fil.nation); //접근해서 data 사용은 가능
	}

}
