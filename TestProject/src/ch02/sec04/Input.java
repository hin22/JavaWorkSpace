package ch02.sec04;

//Scanner 클래스 사용하기 위해 import(클래스 밖에서 import) : java.utill.Scanner
//import 하려면 클래스 패키지명과 클래스명 정확하게 써줘야하고

import java.util.Scanner; //외부 객체?클래스? - ★인스턴스★라고 불리우는 객체 참조변수를 만들어서 사용해야 함

public class Input {
	
	public static void main(String[] args) {
		
	//참조형 변수 sc : 참조형 변수(인스턴스) 선언시 활용 객체 타입으로 선언
	//Scanner sc;
	//sc = new Scanner();
	Scanner sc = new Scanner(System.in); //input? 사용하겠다? //키보드를 통해 입력된 바이트 코드를 메소드에 따라 결과 값 반환
	int num1, num2;
	
	System.out.print("첫번째 숫자 입력 : ");
	//사용자가 입력 후 enter 넣을 때 까지 대기
	num1 = sc.nextInt();
	
	System.out.print("두번째 숫자 입력 : ");
	//사용자가 입력 후 enter 넣을 때 까지 대기
	num2 = sc.nextInt();
	
	System.out.println("두 수의 합은 : "+(num1 + num2));
	System.out.println("두 수의 곱은 : "+(num1 * num2));
	
	
	/////	/////	/////	/////
	// 문자열 입력 : sc.next();
	
	String grade;
	System.out.print("문자열을 입력하세요 : ");
	grade = sc.next();
	System.out.println("입력 받은 문자열 : "+grade);
	
	char grd;
	System.out.print("문자를 입력하세요 : ");
	//grd = sc.next(); //한문자던 여러 만주던 문자열 타입으로 반환 -> char에 저장하려면 불가능 
	//문자열로 입력받은 후에 한문자만 추출 : String.charAt(0) 메소드 이용하면 : 첫번째 문자열만 추출 char 반환
	grd = sc.next().charAt(0);
	System.out.println("입력 받은 문자열 : "+grd);
	}
}
