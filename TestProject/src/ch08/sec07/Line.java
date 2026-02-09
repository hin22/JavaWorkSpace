package ch08.sec07;

public class Line extends DrawingObject {

	public Line() {
		penColor = "red"; //바로 접근 가능 public이니
	}
	
	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 선 그리기");
		
	} //추상메소드할 때 평소처럼 상속받으려면 재정의?

}
