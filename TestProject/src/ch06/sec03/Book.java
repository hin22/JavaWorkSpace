package ch06.sec03;

public class Book {
	//도서 한권을 표현하는 클래스
	String title;
	String author;
	int price;
	
	//매개변수가 없는 생성자 - 개발자가 규정한 기본값 초기화
	public Book() {
//		title = "미정";
//		author = "미정";
//		price = 0;
		this("미정","미정",0);
		//this()는 클래스내의 다른 생성자 호출( 생성자가 뭘 호출해? 생성자가 뭐고?)
	}
	
	//매개변수가 있는 생성자 매개변수가 있으면 사용하려고 받았다?
	public Book(String t, String a, int p) {
		title=t;
		author=a;
		price=p;
	}
	
	public void getBook() {
		//책 정보 반환 메소드
	}
}
