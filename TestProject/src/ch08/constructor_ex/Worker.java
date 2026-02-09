package ch08.constructor_ex;

public class Worker {
	private String joominNo, name;
	
	public Worker(String joominNo, String name) {
		this.joominNo = joominNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "성명 : " + joominNo + "\n" + "이름 : " + name;
	}
	
}
