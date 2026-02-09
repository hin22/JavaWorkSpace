package ch12_collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		// Map<key, value>
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// Map의 key는 중복 될 수 없음 : entry 구별하는 용도 key
		
		// Map collection에 객체 저장 : put(key, value)
		// key 값이 중복되었음 => key값이 콜렉션에 존재하는지 확인 후 있으면 value만 수정 없으면 새로운 entry 추가
		map.put("김길동", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //key가 중복되었기 때문에 앞에서 put한 홍길동 : 90 entry의 value만 수정 됨
		//String 클래스는 "' 구성한 문자열 값이 같을 경우 동등객체가 될 수 있도록
		//hashCode()와 equals()메소드가 재정의 되어 있음
		
		// 전체 entry 수 : size()
		System.out.println("총 entry 수 : " + map.size());
		
		//map.get(key) : 특정 키에 대한 value 추출
		
		System.out.println("key 홍길동에 대한 value: " + map.get("홍길동"));
		System.out.println();
		
		//Map.setSet() : 모든 entry의 key 객체를 반환(Set 타입으로 반환)
		Set<String> keySet = map.keySet();
		
		//모든 collection 클래스는 Iterator 인터페이스를 구현한다
		//for문을 쓰다보면 가독성이 떨어진다 그렇다보니 대체할 수 있는 스트림 Iterator 인터페이스를 쓰려한다?
		//Iterator() 객체를 반환해주는 메소드
		//컬렉션 순회를 가능하게 해주는 객체 Iterator
		Iterator<String> keyIterator = keySet.iterator();// keySet에 해당하는 객체를 순회할 수 있는 객체가 하나 넘어올테고
		//map의 전체 entry 를 출력
		//Iterator.hasNext() : 순회 중 참조할 항목이 있는지의 여부 반환(true/false)
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); //현재 참조한 항목의 값을 반환하고 다음 참조쪽으로 이동
			Integer value = map.get(key);
			System.out.println(key +":"+ value);
		}
		
		for(String k : keySet) {
			Integer value = map.get(k);
			System.out.println(k + value);
		}
		
		//map.entrySet() : 모든 entry 반환 (Set 타입으로 반환 - Map은 entry의 중복은 없음)
		//map의 모든 entry
		System.out.println();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> es : entrySet) {
			//특정 entry의 key 추출
			String key = es.getKey();
			Integer value = es.getValue();
			System.out.println(key +" : "+ value);
		}
		System.out.println();
		//모든 entry 삭제 : Map.clear();
		map.clear();
		System.out.println("총 entry 수 : " + map.size());
		
		
		
	}

}
