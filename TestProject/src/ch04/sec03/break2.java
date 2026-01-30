package ch04.sec03;

public class break2 {

	public static void main(String[] args) {
		// 중첩 반복문일 때 break의 범위
		// 이름명명 : 바깥 for문을 지칭하는 label
		// 해당 범위 남은 반복문을 모두 종료
		for(char upper='A'; upper <= 'Z'; upper++) {
			for(char lower='a'; lower <= 'z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower == 'g') {
					break; //중첩 for문 내의 break의 범위 - 가장 가까운 반복범위 lower의 for문과 탈출하고 upper는 끝까지 진행됨
				}
			}
			if(upper=='K') {
				break;
			}
		}

	}

}
