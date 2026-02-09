package ch11.sec03;

public class Product<T, M> {

	//제품을 표현하는 클래스
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}
	
	
}
