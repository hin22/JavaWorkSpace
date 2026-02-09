package ch12_collection.data_arraylist;

import java.util.List;
import java.util.Scanner;

public class MemberControllerMain {

	public static void main(String[] args) {
		//회원 정보 입력 받기 Scanner
		Scanner sc = new Scanner(System.in);
		
		String id, pass, name, phone, address;
		
		MemberDTO dto = null;
		IMemberDAO idao = null;
		idao = new MemberDAO();
		boolean start = true; //반복
		
		while(start) {
			System.out.println("\n1.회원가입 2.회원탈퇴 3.전체회원조회 4.개인회원조회 5.회원정보수정 6.종료");
			System.out.print("선택>");
			int menu = sc.nextInt();
		switch(menu) {
			//회원등록
			case 1 : System.out.println("회원정보를 입력합니다");
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
		
			//1. dto객체 생성
			dto = new MemberDTO(id,pass,name,phone,address);
			idao.insertMember(dto);
			break;
			
	
			//회원삭제
			case 2 : 
			System.out.println("회원정보를 삭제합니다");
			System.out.println("id 입력 : ");
			id = sc.next();
			idao.deleteMember(id);
			break;
			
		case 3 : 
			//전체 회원 조회 반환값이 있다 ArrayList 타입
			System.out.println("회원정보를 조회합니다");
			List<MemberDTO> ar = idao.getAllMember();
			for(MemberDTO mem : ar) {
				System.out.println(mem.getMemId()+ "\t" + mem.getMemPass() + "\t"
						+ mem.getMemName() + "\t" + mem.getMemPhone() + "\t" + mem.getMemAddress());
			}
				break;
		
		//한명 회원 조회
		case 4 : 
			System.out.println("회원정보를 조회합니다");
			System.out.println("id 입력 : ");
			id = sc.next();
			MemberDTO mDTO = idao.searchMember(id);
			if(mDTO == null) {
				System.out.println("해당 id의 회원이 조회되지 않습니다. id값 확인하세요");		
			}else {
				System.out.println("****" + id + "회원 정보 ****");
				System.out.println(mDTO.getMemId()+ "\t" + mDTO.getMemPass() + "\t"
					+ mDTO.getMemName() + "\t" + mDTO.getMemPhone() + "\t" + mDTO.getMemAddress());
			}
				break;
		
		//회원 정보 수정
		//수정 할 회원 정보를 출력
		case 5 : 
			System.out.println("회원정보를 수정합니다");
			System.out.println("수정 회원 id 입력 : ");
			id = sc.next();
			mDTO = idao.searchMember(id);
			
			if(mDTO == null) {
				System.out.println("수정할 회원 정보가 없습니다");
			}else {
				System.out.println("****" + id + "회원 정보 ****");
				System.out.println(mDTO.getMemId()+ "\t" + mDTO.getMemPass() + "\t"
					+ mDTO.getMemName() + "\t" + mDTO.getMemPhone() + "\t" + mDTO.getMemAddress());
				//수정 내용을 입력 받기
				
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
				break;
		case 6 : 
			System.out.println("시스템종료");
			start = false;
			break;
			
			default:
				System.out.println("잘 못 입력하셨습니다 ");
		}
		
		}
	}
}
