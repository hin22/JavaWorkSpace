package ch08.sec07;

public class Rect extends DrawingObject{

	public Rect() {
		penColor = "green";
	}
	@Override
	public void draw() {
		System.out.println(penColor + "로 사각형 그리기");
		
	}


}
