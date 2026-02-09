package ch09.data_interface;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO { //멤버 인터페이스?

	@Override
	public void insertMember(MemberDTO dto) {
		// dto 활용 db에 저장하는 코드
		// 저장했다고 가정하고
		System.out.println("회원가입 성공");
		System.out.println(dto.getMemId() + "\t" + dto.getMemPass() + "\t" 
		+ dto.getMemName() + "\t" + dto.getMemPhone() + "\t" + dto.getMemAddress());
		
		
	}

	@Override
	public void deleteMember(String memId) {
		// memId 활용해서 db에서 삭제를 위한 코드
		// 삭제했다고 가정하고
		System.out.println("회원삭제 성공");
		
	}

	@Override
	public ArrayList<MemberDTO> getAllMember() {
		// 모든 회원정보 반환받아서 MemberDTO에 넣고 ArrayList에 포함해서 리턴
		return null;
	}

	@Override
	public MemberDTO searchMember(String memId) {
		// 회원 검색해서 MemberDTO로 구성 리턴
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// MemberDTO 활용해서 DB에서 수정
		System.out.print("회원정보 수정성공");
		
	} 

}
