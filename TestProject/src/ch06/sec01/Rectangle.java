package ch06.sec01;
import java.util.Scanner;

public class Rectangle {
	// 아래 속성으로는 사용자로부터 데이터 입력할 때 사용
	// 면적 계산용으로 사용 개발자가 원하는 용도로 private가 뭐지?
	// 클래스 속성은 기본값으로 초기화 됨
	
	private int width;
	private int height;
	
	//필드 보호를 위해 필드에 사용자 입력 값을 저장하는 메소드 
	public void input() { //리턴할 값이 없을 땐 void?
		Scanner sc = new Scanner(System.in);
		System.out.print("가로길이 입력 : ");
		width = sc.nextInt();
		System.out.print("세로길이 입력 : ");
		height = sc.nextInt();
	}
	
	public void area() { //사각형 면접을 계산해서 출력하는 메소드 구성
		System.out.println("사각형 면적 : " + width * height);
	}
	//생성자 함수는 개발자가 명시적으로 넣어주지않으면 생성자는 필수이기 때문에 
	//자바(컴파일러)가 자동으로 구성함
}
