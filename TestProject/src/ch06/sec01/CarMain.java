package ch06.sec01;

public class CarMain {

	public static void main(String[] args) {
		// 접근제한자, static?, 리턴하면 타입 무엇인지(void?) main매개변수?
		// 우선 실행하려면 main()에서 해야한다.
		// 사용자 정의 클래스 Car를 인스턴스 생성 Scanner객체 사용할 땐 new 했지만 어떤 것은 그냥 썼다?
		Car c = new Car(); // Car이거랑 Car() 이거랑 같아야하는건가?
		
		Car c1;
		c1 = new Car(); // 생성자 함수 호출? 메소드호출? 객체만들듯이 참조변수까지만 만들고 나중에 해당되는 객체에 할당할 수도 있다
		Car c2 = new Car();
		
		// 객체 속성 사용
		// 독립적인 객체기 때문에 각각의 저장공간이 있다
		c.carNo="11가 1234";
		c1.carNo="22가 5678";
		c2.carNo="33다 3333";
		
		c.carMaker = "현대";
		c1.carMaker = "기아";
		c2.carMaker = "포르쉐";
		
		// 객체 메소드 사용 //? 호출을 하면 car 클래스로 넘어가서 showCarInfo();를 확인 봤더니 출력문이 있고 출력하려는데 carNo가 있고 main()으로 넘어오니 carNo=""대입이 있었으니 그값을 출력한다..?
		c.showCarInfo(); //메소드도 호출 c.showCarInfo(); 이것만 보곤 뭐해주는건지 아직 알 수 없다 하지만 뭐하는지 알려주고 있을것이다 찾아보면 차량번호 : +carNo 출력
		
		System.out.println(c.carMaker); //이렇게도 한다
		//동일패키지내에서는 지금 이렇게 사용할 수 있게끔 구성한 내용들 public으로 만들어져있으면 일단 누구라도 쓸 수 있다라는 의미다 동일패키지내에서는 import없이 사용할 수 있다
	}

}
