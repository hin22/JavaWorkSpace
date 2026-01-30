package ch05.sec01;
import java.util.Scanner;
public class ArrayInputEx1 {

	public static void main(String[] args) {
		// 배열 입력 연습문제
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("숫자 입력 ");
		for(int i=0; i<num.length; i++) {
			System.out.printf("num[%d] : ", i);
			num[i] = sc.nextInt();
			
		}
		System.out.print("\n입력된 값 : ");
		for(int i=0; i<num.length; i++) {
			System.out.printf("%d ", num[i]);
		}
		
		int max = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("\n최댓값 : "+max);
	}

}
