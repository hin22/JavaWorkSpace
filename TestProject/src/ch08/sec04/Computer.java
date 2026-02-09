package ch08.sec04;

public class Computer extends Calculator{
	//메소드 재정의 - 정밀도를 위해 Math.PI 사용
	//Override를 안쓰고 재정의 하려고 했을 때의 오타가 있으면 새로운 메소드가 생성
	// 그것을 방지하기 위해 @Override를 붙여야한다?
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체 areaCircle 실행");
		return Math.PI*r*r;
	}
}
