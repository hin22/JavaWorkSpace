package ch09.book_interface;

public class BookDTO {
	private String bookName; //제목
	private String bookAuthor; //작가
	private int price; //가격
	private int bookNum; //고유 번호(key)
	
	public BookDTO(String bookName, String bookAuthor, int price, int bookNum) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = price;
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	
	
	
}
