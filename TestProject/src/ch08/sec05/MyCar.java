package ch08.sec05;

public class MyCar {
	
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드 자식메소드에서 Override(오버라이딩)재정의 불가능 수정 불가능하게 구성 데이터같은 내용들은 수정하면 안되니까
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
}
