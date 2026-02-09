package ch06.sec03;

public class BookMain {

	public static void main(String[] args) {
		// 
		Book book1 = new Book(); // null ?
		Book book2 = new Book("String","홍길동",34000);
		
		book1.getBook(); // 화면에 "제목: 미정..." 출력
	    book2.getBook(); // 화면에 "제목: 자바의 정석..." 출력
	}

}
