// 한개 소스에 여러 클래스가 있을 때는 public 이라는 접근 권한자는 한개의 클래스만 가능 : 아래 쪽에 public class Test가 있어서 이 클래스에서는 public이 안된다?
// 그렇다고 public을 public Class A로 하는 것보다 main()있는 곳에 public이 있는게 안정적이다
// main() 클래스를 제외하고 나머지는 public 생략하고 다른 권한 생성?
// private라는 것으로?

class A {
	
}

class B {
	
}

public class Test { // 클래스 생성하면 자동으로 클래스 생성 :  클래스 이름

	public static void main(String[] args) { // main() : 메소드, 메소드를 불러서 사용할 수 있다. 자바에 의해서 호출
		// 이 부분이 매우 중요하다 이 메인 안에는 코드를 실행
		// main이 없는 곳에서 프로그램을 실행할 수 없다
		// 프로그램이 시작점(실행을 위해서는 반드시 필요)
		// static 이므로 객체 없이 바로 사용 가능
		// 실행할 때 런타임(자바)이 main을 찾아 호출하는 것 부터 시작
		// 파일 이름과 클래스명은 똑같아야 한다.
		// 문장 블럭 마지막 세미콜론 ;
		System.out
		.println("test"
				+"");
		
		
		// 출력을 위한 코드 : System 이라는 객체가 가지고 있는 1번장치 out이라는 스트림 그리고 객체에 println 이라는 메소드 사용
		System.out.println("test 입니다"); // 메소드니까 함수 인수로 전달?
		// 한줄 주석
		/*
		 * 여러 줄 주석
		 */
		
		{
			//영역 범위 표시(클래스, 메솓, 조건문, 반복문 등)	
		}
		
	}

}
