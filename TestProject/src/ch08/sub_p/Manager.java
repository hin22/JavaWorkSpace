package ch08.sub_p;

import java.util.Scanner;

import ch08.super_p.Employee; //다른 패키지 상속 받으려면 import해야 한다.

public class Manager extends Employee{
	//Scanner sc = new Scanner(System.in); 런타임 예외 발생(키보드 하나로 두개의 객체 참조) Employee
	//Employee를 상속 받았음, 필드는 모두 private 이므로 직접 접근 불가
	//part = "abc"; 이렇게 직접 접근은 안된다
	//단 필드의 저장 공간은 생성됨
	
	private String position; //직위
	
	//Manager 객체 정보 저장 메소드
	//두번 이상 사용하면 sc close되어버려 오류
	public void setManager() {
		setEmployee();//super클래스메소드 호출 일반 정보를 사용할 수 있게 empNo 등
		System.out.print("직위 입력 : "); //Manager 고유 정보(변수?)
		position = sc.next(); //sc 상속받은 참조 변수
		//sc.close();
	}
	
	//Manager 객체 정보 출력
	public void showManagerInfo() {
		showEmpInfo();//슈퍼클래스 메소드도 상속 가능하다?
		System.out.println("직위 : " + position); //메소드 내부가 아니면 에러
	}
	
	public void exitSc() {
		sc.close();
	}
	
}
