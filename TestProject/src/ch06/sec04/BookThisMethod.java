package ch06.sec04;

public class BookThisMethod {
	String title;
	String author;
	int price;
	
	//매개변수가 없는 기본 생성자
	BookThisMethod() {
		this("미정","미정"); //현재 클래스 내의 다른 생성자 호출
		//this("미정",0); //this메소드는 무조건 첫번 째 줄에만 나와야함 두번사(호출)용은 불가능
		price = 0;
	}
	
	BookThisMethod(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//매개변수가 2개인 똑같은 생성자 이지만 매개변수 타입이 다르기에 구별 됨
	BookThisMethod(String title, int price) {
		this.title = title;
		this.price = price;
		//null로 초기화가 된다고?
	}
	
}
