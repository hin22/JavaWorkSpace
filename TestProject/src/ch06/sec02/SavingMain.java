package ch06.sec02;

public class SavingMain {

	public static void main(String[] args) {
		// 
		
		Savings sv = new Savings();
		
		sv.setName("홍길동");
		
		sv.setBalance(10000); //입금 전 잔액
		
		System.out.println("예금주 : " + sv.getName());
		System.out.println("입급전 잔액 : " + sv.getBalance());
		
		sv.inputDeposit();
		
		System.out.println("이자 : " + sv.getInterest());
		System.out.println("최종 잔액 : " + sv.getBalance());
	}

}
