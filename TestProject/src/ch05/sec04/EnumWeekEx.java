package ch05.sec04;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// 열거타입 사용 예시
		Week today = null; //Week 객체타입과 동일, 초기값으로 null
		//today 참조변수가 참조할 데이터는 Week(객체) 참조 즉, Week 객체의 상수값만 대입가능 상수값?
		
		//Calendar 클래스는 Instance생성하는 메소드를 제공할 getInstance() 메소드 이용해서 생성된 인스턴 반환받도록 되어 있음
		//Date, Calendar, LocalDateTime : 날짜 및 요일, 시간을 반환받을 수 있음
		Calendar cal = Calendar.getInstance(); //new연산자 객체를 사용하는게 아니라 getInstance(0 메소드를? 반환?
		//메모리를 할당받아서 해라? 라는 것과 너가 직접 메모리를 만들어라? 하는 클래스도 있다?
		
		//get메소드?? 날짜 정보 시간들을 가져올 수 있다?
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //캘린더 객체를 통해서 요일 값을 가지고 온다.
		int week = cal.get(Calendar.DAY_OF_WEEK); //1~7까지의 정수 반환 일요일부터시작
		
		//Week 변수의 값에 따라 today라는 참조변수에 Week 상수 참조 대입
		switch(week) {
			case 1 : 
				today = Week.SUNDAY; // 어딘가에 저장하겠다고 한다면 열거타입 변수에 넣어줘야한다 그래서 Week today라는 열거타입 변수를 만들었다?
				break;
			case 2 : 
				today = Week.MONDAY;
				break;
			case 3 : 
				today = Week.TUESDAY;
				break;
			case 4 : 
				today = Week.WEDNESDAY;
				break;
			case 5 : 
				today = Week.THURSDAY;
				break;
			case 6 : 
				today = Week.FRIDAY;
				break;
			case 7 : 
				today = Week.SATURDAY;
				break;
			
		}
		System.out.println("오늘 요일 : " + today); //객체참조변수를 print문에 적용하면 내부에 저장된 속성 값을 출력해주는 기능이 있다. 문자열을 출력해주는 메소드가 출력을한거다 메인메소드에 의해서 열거타입이 가지고 있는 
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println(" 열심히 공부합니다 ");
		}
		
		// 열거객체 메소드
		today = Week.SUNDAY;
		Week day = Week.WEDNESDAY;
		String name = today.name(); //name() 메소드 통해서 상수가 저장하는 문자열을 반환받음
		System.out.println(name);
		
		//열거 객체의 순번리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal); //순번은 0부터 시작
		int result1 = today.compareTo(day);
		int result2 = day.compareTo(today);
		System.out.println(result1); //4 순번이 늦음
		System.out.println(result2); //-4 순번이 빠름
		
		//매개값과 동일한 문자열을 갖는 열거 객체 리턴
		Week weekDay = Week.valueOf("SUNDAY");
	}

}
