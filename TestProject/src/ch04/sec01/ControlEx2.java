package ch04.sec01;
import java.util.Scanner;

public class ControlEx2 {
	
			public static void main(String[] args) {
			// 제어문 연습문제 2
			Scanner sc = new Scanner(System.in);
			
			// 공통변수 선언
			String productName ="";
			int price = 0;
			
			System.out.println("****** 상품 정보 ******");
			System.out.println("1 노트북 : 1,200,000원");
			System.out.println("2 디지털카메라 : 400,000원");
			System.out.println("*********************");
			
			System.out.print("상품번호 입력 : ");
			int num = sc.nextInt();
			
			if(num == 1) {
				productName = "노트북";
				price = 1200000;
			}else if(num == 2) {
				productName = "디지털카메라";
				price = 400000;
			}else {
				System.out.print("잘못 입력하였습니다. 종료합니다.");
				sc.close();
				return;
			}
			
			//주문수량
			System.out.print("주문수량 입력 : ");
			int quantity = sc.nextInt();
			int orderPay = quantity * price;
			
			double discountRate = 0;
			if(orderPay >= 1000000) {
				discountRate = 0.1; 
			}else if(orderPay >= 500000) {
				discountRate = 0.05;
			}
			
			int discountPay = (int)(orderPay * discountRate);
			int totalPay = orderPay - discountPay;
			
			System.out.println("****** 주문 내용 ******");
			System.out.println("상품명 : " + productName);
			System.out.println("가격 : " + price + " 원");
			System.out.println("주문 수량 : " + quantity + " 개");
			System.out.println("주문액 : " + orderPay + " 원");
			System.out.println("할인액 : " + discountPay + " 원");
			System.out.println("총지불액 : " + totalPay + " 원");
			
			sc.close();
	}
}
