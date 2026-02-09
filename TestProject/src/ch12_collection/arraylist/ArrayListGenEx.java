package ch12_collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenEx {

	public static void main(String[] args) {
		// ArrayList 제네릭타입 사용
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase"); //직접 정해준 2 인덱스로 저장
		list.add("MyBATIS");
		//list.add(30); //generic 타입 사용 int형은 삽입 불가능
		
		int size = list.size();
		
		System.out.println("총 항목 수 : " + size);
		System.out.println();
	
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);//String 타입으로 구체화
		}
		
		System.out.println();
		String skill = list.get(2);
		System.out.println(2 + ":" + skill);
		
		list.remove(2); //특정 인덱스 값을 삭제하면 2번 인덱스 공간은 이후 항목들이 하나 씩 이동하면서 채움
		list.remove(2);
		list.remove("MyBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);//String 타입으로 구체화
		}
		
		System.out.println();
		for(String value : list) {
			System.out.println(value);
		}
		
		//문자열 : 문자열 개수 반환(length())
		System.out.println();
		System.out.println("각 항목의 문자 수");
		for(String value : list) {
			System.out.println(value + ":" + value.length());
		}
	}

}
