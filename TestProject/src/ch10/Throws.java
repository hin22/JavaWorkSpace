package ch10;

public class Throws {

	public static void main(String[] args) {
		// Throws문 포함된 메소드 호출
		
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}catch(Exception e) {
			
		}

	}
	
	public static void findClass() throws ClassNotFoundException { //thows 예약어, 메소드 호출한 쪽에 예외발생 신호 보냄(떠넘김)
		Class clazz = Class.forName("java.lang.String2"); //메소드 내 코드에서 예외 발생
	}
	
	public static void findClass2() throws ClassNotFoundException { //thows 예약어, 메소드 호출한 쪽에 예외발생 신호 보냄(떠넘김)
		Class clazz = Class.forName("java.lang.String2"); //메소드 내 코드에서 예외 발생
	}
}
