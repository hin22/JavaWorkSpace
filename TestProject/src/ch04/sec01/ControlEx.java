package ch04.sec01;
import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		// 제어문 연습문제
		Scanner sc = new Scanner(System.in);
		
		int num, ea;
		int noteBook = 1200000;
		int digital = 400000;
		double discountRate = 0;
		
		System.out.println("****** 상품 정보 ******");
		System.out.println("1 노트북 : 1,200,000원");
		System.out.println("2 디지털카메라 : 400,000원");
		System.out.println("*********************");
		
		System.out.print("상품번호 입력 : ");
		num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("주문수량 입력 : ");
			ea = sc.nextInt();
			int notePay = ea * noteBook;
			
			if(notePay >= 1000000) {
				discountRate = 0.1;
			}else if(notePay >= 500000){
				discountRate = 0.05;
			}
			int nbDcPay = (int)(notePay * discountRate);
			int totalPay = notePay - nbDcPay;
			System.out.println("****** 주문 내용 ******");
			System.out.println("상품명 : 노트북");
			System.out.println("가격 : " + noteBook + "원");
			System.out.println("주문 수량 : " + ea + "개");
			System.out.println("주문액 : " + notePay + "원");
			System.out.println("할인액 : " + nbDcPay + "원");
			System.out.println("총지불액 : " + totalPay  + "원");
		}else if(num == 2) {
			System.out.print("주문수량 입력 : ");
			ea = sc.nextInt();
			int digitalPay = ea * digital;
			
			if(digitalPay >= 1000000) {
				discountRate = 0.1;
			}else if(digitalPay >= 500000){
				discountRate = 0.05;
			}
			
			int dcDcPay = (int)(digitalPay * discountRate);
			int totalPay = digitalPay - dcDcPay;
			System.out.println("****** 주문 내용 ******");
			System.out.println("상품명 : 디지털카메라");
			System.out.println("가격 : " + digital + "원");
			System.out.println("주문 수량 : " + ea + "개");
			System.out.println("주문액 : " + digitalPay + "원");
			System.out.println("할인액 : " + dcDcPay  + "원");
			System.out.println("총지불액 : " + totalPay  + "원");
		}else {
			System.out.print("잘못 입력하였습니다. 종료합니다.");
		}
		
		sc.close();
	}

}
