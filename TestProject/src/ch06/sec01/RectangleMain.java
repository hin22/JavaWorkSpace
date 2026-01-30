package ch06.sec01;

public class RectangleMain {

	public static void main(String[] args) {
		// Rectangle class 사용 예시
		Rectangle rec;
		rec = new Rectangle(); //생성자 함수
		
		//사각형 넓이 계산
		//객체 인스턴스로 private 속성에는 접근 불가
		//rec.width = 20; private
		//rec.height = 10; private
		//필드 초기화 없이 메소드 호출
		
		//main에서 클래스 객체 속성에 직접 접근 값 저장객체 밖에서 접근
		rec.area(); //main()말고 클래스에서 함수를 하나 만들어줄테니 그 함수를 이용해서 값을 넣도록 진행할 수도 있다
		
		//main에서 클래스 객체 속성에 메소드(함수)를 통해 속성에 값 저장 간접 접근 차이 heap 영역에서 접근
		rec.input(); //모든 실행은 main()이 있어야하니 main()메소드인 이 쪽에서 호출하는건가?!
		rec.area(); // input에서 입력받았기에 area() 값 변경 그래서 한번 더 출력해서 확인
		
		//System.out.println(rec.width); //객체인스턴스
		//main()입장에서는 위에 rec.width = 20; 여기에서 직접 넣었으니 직접? input()은 클래스에서 간접으로 넣고 호출?
	}

}
