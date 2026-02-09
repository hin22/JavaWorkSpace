package ch08.sec03;

class A{
	public A(int x) { //기본생성자 아래 명시적 생성자에 super(); 그러면 여기도 기본생성자에서 명시적 생성자가 된다
		System.out.println("명시생성자 A"); // 기본생성자였지만 인수를 super로 전달? 명시적생성자 됨
	}
}

class B extends A{
	public B(int x) { //인수 값 명시적 생성자
		//super 클래스에 기본 생성자가 없으면 B클래스의 생성자에서는 A클래스생성을 요청할 수 없다
		super(x);
		System.out.println("명시적생성자 B" + x); //명시적 기본 생성자
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		// 
		B b = new B(5);
		
		Employee emp1 = new Employee("1234","홍길동","마케팅");
		Employee emp2 = new Employee("3214","ㄱ길동","마케팅");
		System.out.println(emp2); //객체 인스턴스의 출력, Employee클래스에 toString() 재정의 되어 있으므로 toString이 자동 호출
		
		//생성자의 매개변수 전달
		Manager mg = new Manager("1234","홍길동","마케팅","대리");
		System.out.println(mg);
	}
	
	

}
