package ch12_collection.data_arraylist;

import java.util.ArrayList;
import java.util.List;

//컨트롤러와 DAO의 중간자 역할을 진행함
public interface IMemberDAO {
	
	//회원등록 : 1명의 회원 정보를 받아서 DB에 저장하고 종료 변환값 없음
	public void insertMember(MemberDTO dto);
	
	//회원정보 삭제 : 회원의 아이디(memId)를 전달 받아서
	//DB에서 해당되는 회원 찾아서 삭제 종료 반환값 없음
	public void deleteMember(String memId);
	
	//전체 회원정보 조회
	//DB(회원테이블)에서 전체 회원 정보를 반환
	//회원 여려명을 표현 : 개발코드 입장에서느 MemberDTO 타입의 인스턴스 여러개 저장
	//Array(배열은 처음부터 크기가 고정되기 때문에 Array배열만으로는 할 수 없다)
	//따라서 배열의 확장인 ArrayList를 활용, 가변배열처럼 사용가능
	//ArrayList : import필요, generic 타입으로 해야 좋다/이런 참조 타입은 어떤 타입을받을지 알려줘야한다
	//<MemberDTO> 원소를
	public List<MemberDTO> getAllMember();
	
	//한명 회원정보 조회 : 매개변수 있어야한다
	//memId 전달 받아서 db에서 검색 후 회원 한명의 정보 특정할 수 있는 정보(MemberDTO)를 반환하는 메소드
	//매개변수로 정보 찾아서 MemberDTO에 다시 리턴
	public MemberDTO searchMember(String memId);
	
	//회원정보 수정
	//memId를 포함하는 수정정보를 MemberDTO(전체) 전달받아서 db에서 회원 정보 수정 후 종료 반환값 없음
	//전체데이터를 수정하는 형태로 구성하는 것이 좋다
	//수정하지 않는 정보는 그대로 수정이된 정보는 수정된 값을 넣어서 인스턴스 만든다(컨트롤러가 해야할 일)
	public void updateMember(MemberDTO dto);
}
