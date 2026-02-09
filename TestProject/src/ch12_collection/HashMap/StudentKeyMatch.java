package ch12_collection.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentKeyMatch {

	public static void main(String[] args) {
		Student key = new Student("3","성춘향");
		// key를 참조타입으로 사용
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student("1","홍길동"), 90);
		map.put(new Student("2","이몽룡"), 80);
		map.put(key, 100); //key : 독립적인 Student 인스턴스
		map.put(key, 99); //새로운 entry 추가
		// 새로운 entry 추가 : Student 클래스의 equals() // hashcode() 재정의 하면 동등 객체로 처리할 수 있음
		Set<Student> key_set = map.keySet();
		
		System.out.println(key_set);
		for(Student stdKey : key_set) {
			System.out.println(stdKey.getStdNo() + " " + stdKey.getStdName() + " " + map.get(stdKey));
		}
		System.out.println("총 Entry 수 : " + map.size());
		//사용자 정의 클래스에서 객체를 HashMap의 키로 사용하려면
		//hashCode() 와 equals() 메소드를 재정의해서 동등객체가 될 조건을 정해야 함
	}

}
