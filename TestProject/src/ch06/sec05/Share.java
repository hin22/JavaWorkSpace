package ch06.sec05;

public class Share {
	int a;
	static int staticA;
	
	///////////////////
	/// 메소드
	public void set(int n) { //인스턴스 메소드
		a += n;
		staticA+=n;
	}
	
	public int showA() {
		return a;
	}
	
	public static int showStaticA() { // static 붙이면 그냥 a 안된다?
		//return a; statcA?
		return staticA;
	}
}
