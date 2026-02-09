package ch09.book_interface;

import java.util.ArrayList;

public interface IBookDAO {
	
	// 도서 등록
	public void bookInsert(BookDTO dto);
	// 도서 삭제
	public void bookDelete(int bookNum);
	// 전체 조회
	public ArrayList<BookDTO> bookAllList();
	// 제목 조회
	public BookDTO bookList(String bookName);
	// 고유번호 조회
	public BookDTO bookList(int bNum);
	// 도서정보 수정
	public void bookUpdate(BookDTO bookNum);
	
	
}
