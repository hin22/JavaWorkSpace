package ch11.sec04;

public class Util {

	//제네릭 메소드 
	//Box<T> 는 반환타입
	// <T> 인스턴스만들 때 호출할 때 파라미터
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	//멀티타입 사용 제네릭 메소드
	//두 객체를 전달받아 동일한지 확인하는 메소드
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
		
	}
}
