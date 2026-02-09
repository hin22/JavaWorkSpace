package ch12_collection.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {

	public static void main(String[] args) {
		// 고정된 객체들도 ArrayList 구성
		List<String> list1 = Arrays.asList("홍길동", "신길동", "김자바");
		for(String name : list1) {
			System.out.println(name);
		}
		//list1.add("김길동"); //오류발생 add는 제공 되지 않음
		//list1.remove(0); //오류발생 add는 제공 되지 않음
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int num : list2) {
			System.out.println(num);
		}
	}

}
