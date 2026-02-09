package ch09.book_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String bName;
		String bAuthor;
		int bPrice;
		int bNum;
		
		// 도서 정보 입력 - 제목, 작가, 가격, 고유번호(자동발생)
		System.out.println("도서 정보 입력");
		System.out.println("도서 명 입력 : ");
		bName = sc.next();
		System.out.println("도서 작가 입력 : ");
		bAuthor = sc.next();
		System.out.println("도서 가격 입력 : ");
		bPrice = sc.nextInt();
		
		BookDTO dto = new BookDTO(bName, bAuthor, bPrice, 0); //bookNum으로 key
		
		IBookDAO dao = new BookDAO();
		dao.bookInsert(dto);
		
		
		// 도서 정보 삭제 - 고유 번호로 이용
		System.out.println("삭제할 도서 번호 입력 : ");
		bNum = sc.nextInt();
		
		dao.bookDelete(bNum);
		
		
		// 도서 전체 조회
		System.out.println("도서 전체 정보");
		ArrayList<BookDTO> allList = dao.bookAllList();
		for(BookDTO d : allList) {
			System.out.println("제목 : " + d.getBookName() + "작가 : " + d.getBookAuthor() + "가격 : " + d.getPrice() + "번호 : " + d.getBookNum());
			}
		
		
		// 도서 조회 제목으로 이용
		System.out.println("도서 정보 검색");
		
		System.out.println("도서 제목 입력 : ");
		bName = sc.next();
		dto = dao.bookList(bName);
		if(dto != null) {
			System.out.println("제목 : " +dto.getBookName() + "작가 : " + dto.getBookAuthor() + "가격 : " + dto.getPrice() + "번호 : " + dto.getBookNum());
		}
		
		// 도서 조회 고유번호 이용
		System.out.println("도서 번호 입력 : ");
		bNum = sc.nextInt();
		dto = dao.bookList(bNum);
		
		if(dto != null) {
			System.out.println("제목 : " + dto.getBookName() + "작가 : " + dto.getBookAuthor() + "가격 : " + dto.getPrice() + "번호 : " + dto.getBookNum());
		}else {
			System.out.println("정보가 없습니다");
		}
		
		
		// 도서 수정 고유 번호로 찾아와 수정 후 저장 그리고 다시 확인
		System.out.println("수정이 필요한 번호를 입력해주세요 : ");
		bNum = sc.nextInt();
		
		System.out.println("도서 명 입력 : ");
		bName = sc.next();
		System.out.println("도서 작가 입력 : ");
		bAuthor = sc.next();
		System.out.println("도서 가격 입력 : ");
		bPrice = sc.nextInt();
		
		dto = new BookDTO(bName, bAuthor, bPrice, bNum);
		
		dao.bookUpdate(dto);
		
		System.out.println("수정한 정보 확인");
		dto = dao.bookList(bNum);
		if(dto != null) {
			System.out.println("제목 : " + dto.getBookName() + "작가 : " + dto.getBookAuthor() + "가격 : " + dto.getPrice() + "번호 : "+dto.getBookNum());
		}
		
	}

}
