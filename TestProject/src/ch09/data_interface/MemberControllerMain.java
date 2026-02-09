package ch09.data_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberControllerMain {

	public static void main(String[] args) {
		//회원등록
		//회원 정보 입력 받기 Scanner
		Scanner sc = new Scanner(System.in);
		
		String id, pass, name, phone, address;
		
		System.out.println("회원정보를 입력합니다");
		System.out.println("id 입력 : ");
		id = sc.next();
		System.out.println("pass 입력 : ");
		pass = sc.next();
		System.out.println("name 입력 : ");
		name = sc.next();
		System.out.println("phone 입력 : ");
		phone = sc.next();
		System.out.println("address 입력 : ");
		address = sc.next();
		
		//회원등록 모듈
		//1. dto 객체 생성
		MemberDTO dto = new MemberDTO(id, pass, name, phone, address);
		
		//2. db 저장을 위한 DAO 메소드 호출
		MemberDAO dao = new MemberDAO();
		dao.insertMember(dto);
		
		//인터페이스로 접근하는 것을 권장
		IMemberDAO idao = new MemberDAO();
		idao.insertMember(dto);
		
		//회원삭제
		System.out.println("회원정보를 삭제합니다");
		System.out.println("id 입력 : ");
		id = sc.next();
		idao.deleteMember(id);
		
		//전체 회원 조회 반환값이 있다 ArrayList 타입
		System.out.println("회원정보를 조회합니다");
		ArrayList<MemberDTO> list = idao.getAllMember();
		System.out.println("반복문을 통해 list 출력 코드");
		
		//한명 회원 조회
		System.out.println("회원정보를 조회합니다");
		System.out.println("id 입력 : ");
		id = sc.next();
		MemberDTO mDTO = idao.searchMember(id);
		System.out.println("mDTO 출력코드");
		
		//회원 정보 수정
		//수정 할 회원 정보를 출력
		System.out.println("회원정보를 수정합니다");
		System.out.println("수정 회원 id 입력 : ");
		id = sc.next();
		mDTO = idao.searchMember(id);
		System.out.println("한명 회원정보 출력");
		
		//수정 내용을 입력 받기
		System.out.println("id 입력 : ");
		id = sc.next();
		System.out.println("pass 입력 : ");
		pass = sc.next();
		System.out.println("name 입력 : ");
		name = sc.next();
		System.out.println("phone 입력 : ");
		phone = sc.next();
		System.out.println("address 입력 : ");
		address = sc.next();
		
		dto = new MemberDTO(id, pass, name, phone, address);
		
		idao.updateMember(dto);
	}
}
