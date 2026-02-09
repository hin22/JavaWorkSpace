package ch07.sec02;

import java.util.Scanner;

//패키지 바뀌면 import해야한다? 자동으로 import 구문을 넣어줬는데 빨간줄이 나온다 : public 없이 만든 클래스는 접근제한이 생략된 경우 동일 패키지에서만 쓸 수 있는 패키지 접근 제한임
//다른 패키지 클래스 import시 해당 클래스는 접근제한이 pulbic 이여야 한다 생략되면 import 불가능
import ch07.sec01.Add; //다른패키지 class import되고 있다 
//import ch07.sec01.Divide; //접근제한 생략된 클래스 이므로 import 불가능
import ch07.calc.Multiply;
import ch07.calc.Subtract;
import ch07.calc.Divide;

public class Main {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char op;
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 (+, -, *, /) : ");
		op = sc.next().charAt(0);
		
		switch(op) {
		case '+':
			Add ad = new Add(num1, num2);
			ad.calculator(); break;
		case '-':
			Subtract s = new Subtract(num1, num2);
			s.calculator(); break;
		case '*':
			Multiply m = new Multiply(num1, num2);
			m.calculator(); break;
		case '/':
			Divide d = new Divide(num1, num2);
			d.calculator(); break;
		default:
			System.out.println("연산자를 잘못 입력하였습니다.");
		}
		
		sc.close();
	}
}
