package ch12_collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList listAr = new ArrayList();
		
		List list = new ArrayList();
		
		list.add(100);
		list.add("홍길동");
		list.add(5.77);
		list.add('a');
		
		
		//컬렉션 내 객체의 개수 반환
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		//특정 index에 추가
		list.add(0, "변경"); //모든 요소를 하나씩 뒤로 이동함
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //Object 타입으로 진행되었음
		}
		
		System.out.println();
		//특정 index에 추가
		list.remove(1); //모든 요소를 하나씩 뒤로 이동함
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //Object 타입으로 진행되었음
		}
		
		System.out.println();
		//특정 요소가 리스트 내 항목 포함 여부
		System.out.println(list.contains("홍길동"));
		if(!(list.contains("홍길동"))) {
			list.add("홍길동");
		}
	}
}
