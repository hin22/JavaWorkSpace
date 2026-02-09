package ch08.sec02;

import ch08.sub_p.Manager;

public class empMain {

	public static void main(String[] args) {
		// sub 클래스 객체 생성
		Manager mg = new Manager();
		
		mg.setManager(); //1차 정보 저장
		mg.showManagerInfo(); //저장된 정보 확인
		//위에 실행했을 때 오류가 나온다 Scanner Scanner가 하위클래스 둘다 있어서?
		mg.setManager(); //다시 입력
		mg.showManagerInfo();
		mg.exitSc();
	}

}
