package ch12_collection.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i < 4; i++) {
			System.out.print("단어를 입력하세요 >> ");
			list.add(sc.next());
			
		}
		
		for(String word : list) {
			System.out.print(word + " ");
			System.out.println();
		}
		
		String longWord = list.get(0);
		for(int i=1; i<list.size(); i++) {
			if(list.get(i).length() > list.get(0).length() ) {
				longWord = list.get(i);
			}
		}
		System.out.println("가장 긴 단어는 : " + longWord);
		System.out.println("가장 긴 단어의 길이는 : " + longWord.length());
		
		
		

	}

}
