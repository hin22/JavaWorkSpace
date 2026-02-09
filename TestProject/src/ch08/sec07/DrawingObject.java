package ch08.sec07;

//추상 클래스
public abstract class DrawingObject {
	public String penColor;
	
	//draw() 메소드는 반드시 필요하지만 무슨 기능할지는 결정되지 않은 상태
	// abstract를 붙여서 추상메소드로 구성 그러면 상속받은 클래스가 draw() 메소드를 활용한다(구체화)
	public abstract void draw();
}
