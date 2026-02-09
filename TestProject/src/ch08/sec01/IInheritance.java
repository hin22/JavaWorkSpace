package ch08.sec01;

public class IInheritance {

	public static void main(String[] args) {
		// 상속예제
		Child ob = new Child();
		ob.setChild(); //sub 클래스 메소드 setChild() 호출
		ob.setParent(); //super 클래스 메소드 호출 
		ob.showChild();//sub클래스 메소드 호출
		
		//왜 호출이 되는거야 여기가 최상위클래스야?
		
		
		Parent pb = new Parent();
		pb.setParent();
		pb.showParent();
	}

}
