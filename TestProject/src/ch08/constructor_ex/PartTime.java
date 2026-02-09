package ch08.constructor_ex;

public class PartTime extends Worker {

	private int hours, unitPrice;
	
	public PartTime(String joominNo, String name, int hours, int unitPrice) {
		super(joominNo, name);
		this.hours = hours;
		this.unitPrice = unitPrice;
	}
	
	public int calculatorPay() {
		return hours * unitPrice;
	}
	@Override
	public String toString() {
		return super.toString() + "\n" + "시급 : "+ unitPrice + "\n" + "시간 : "  + hours + "\n" + "총액 : " + calculatorPay();
	}
	
}
