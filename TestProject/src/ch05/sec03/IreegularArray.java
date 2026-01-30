package ch05.sec03;

public class IreegularArray {

	public static void main(String[] args) {
		// 가변배열(비 정방형 배열)
		// 각 행마다 열의 개수가 다른 배열
		int[][] a = new int[4][]; //행수만 결정된 2차원 배열 2차원은 행이 반드시 있어야한다 일단 a 배열이 만들어졌다?
		//열수 결정(원소수 결정) : 행마다 원소수를 다르게 결정
		a[0] = new int[1];
		a[1] = new int[2]; //행마다 열의 개수가 다를 수 있다 가변배열이라
		a[2] = new int[3];
		a[3] = new int[4];
		
		char b[][] = {{'a'},{'b','c'},{'d','e','f'}}; // new char[3][] 
		
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.printf("score[%d][%d] = %c%n", i, j, b[i][j]);
			}
			System.out.println();
		}
	}

}
