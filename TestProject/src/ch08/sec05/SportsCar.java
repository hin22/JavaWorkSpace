package ch08.sec05;

public class SportsCar extends MyCar {
	
	@Override
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드는 재저으이 불가
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
	
}
