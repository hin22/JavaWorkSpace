package ch09.book_interface;

import java.util.ArrayList;

public class BookDAO implements IBookDAO {
	
	//자동 번호 생성 list에 저장
	private ArrayList<BookDTO> list = new ArrayList<>(); 
	//자동 번호 생성 카운터용
	private static int sequence = 0;
	
	@Override
	public void bookInsert(BookDTO dto) { // 입력
		sequence++; //자동생성 번호 카운트
		dto.setBookNum(sequence);
		list.add(dto);
		
		System.out.println("도서 등록 성공");
		System.out.println("도서 제목 : " + dto.getBookName());
		System.out.println("도서 작가 : " + dto.getBookAuthor());
		System.out.println("도서 가격 : " + dto.getPrice());
		System.out.println("도서 번호 : " + dto.getBookNum());
	}

	@Override
	public void bookDelete(int bookNum) { //고유번호로 삭제
		
		for(int i=0; i<list.size(); i++ ) {
			if(list.get(i).getBookNum() == bookNum) {
				list.remove(i);
				System.out.println("도서 정보 삭제 완료");
				return;
			}
			
			}
			System.out.println("없는 번호 입니다.");
		}
		 
	

	@Override
	public ArrayList<BookDTO> bookAllList() { // 전체 조회
		
		return list;
	}

	@Override
	public BookDTO bookList(String bookName) { // 제목으로 정보 조회
		for(BookDTO fn : list ) {
			if(fn.getBookName().equals(bookName)) {
				return fn;
			}
		}
		System.out.println("없는 도서명 입니다.");
		return null;
	}

	@Override
	public BookDTO bookList(int bookNum) { //도서 고유번호로 정보 찾기
		for(BookDTO fn : list) {
			if(fn.getBookNum() == bookNum) {
				return fn;
			}
		}
			return null;
		
	}

	@Override
	public void bookUpdate(BookDTO dto) { //도서 정보 수정 도서번호로 찾아와서
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getBookNum() == dto.getBookNum()) {
				
				int ogNum = list.get(i).getBookNum();
				
				BookDTO saveDto = new BookDTO(dto.getBookName(), dto.getBookAuthor(), dto.getPrice(), ogNum);
				
				list.set(i, saveDto);
				System.out.println(ogNum + "도서 정보 수정 완료");
				return;
			}
			
		}
		
	}


	
}
