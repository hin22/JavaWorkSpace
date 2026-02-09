package ch06.sec04;

public class CarThis {
	
	String model;
	int speed;
	
	CarThis(String model) { // 자동차 생성될 때 model 결정
		this.model = model; // this는  현재 클래스 CarThis를 참조하게 함
		
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//클래스 내부 메소드에서 현재 클래스 참조위해 this 참조
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);;
			System.out.println(this.model + 
					"가 달립니다.(시속 : " + this.speed + "km/h)");
		}
	}
	
	//this 참조 사용 없이 이름만으로 사용
	//this 참조 없이 구별이 불가능할 때 사용
	void run2() {
		for(int i=10; i<=50; i+=10) {
			setSpeed(i);;
			System.out.println(model + 
					"가 달립니다.(시속 : " + speed + "km/h)");
		}
	}
	
}
