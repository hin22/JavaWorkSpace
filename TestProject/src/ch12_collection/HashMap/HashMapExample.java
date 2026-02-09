package ch12_collection.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		// HashMap 연습문제
		Map<String, String> findWord = new HashMap<>();
		
		findWord.put("apple", "사과");
		findWord.put("summer", "여름");
		findWord.put("candy", "사탕");
		findWord.put("school", "학교");
		findWord.put("football", "축구");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("단어를 추가하시겠습니까? add 입력, 검색하시겠습니까? search 입력, 전체 조회 하시겠습니까? list,  종료하시겠습니까? exit 입력");
			String check = sc.next();
			if(check.equals("add")) {
				System.out.println("단어를 입력해주세요");
				String inputEng = sc.next();
				System.out.println("뜻을 입력해주세요");
				String inputKor = sc.next();
				
				findWord.put(inputEng, inputKor);
				System.out.println("단어" + inputEng+ "추가했습니다.");
			
			}else if(check.equals("search")) {
				System.out.println("찾으시는 단어를 입력해 주세요.");
				String iWord = sc.next();
				
				String result = findWord.get(iWord);
				
				if(result != null) {
					System.out.println("찾으시는 단어는 : " + result);
				}else {
					System.out.println("없는 단어입니다. ");
				}
				
			}else if(check.equals("list")) {
				if(findWord.isEmpty()) {
					System.out.println("등록 된 단어가 없습니다");
				}else {
					System.out.println("등록된 단어");
					System.out.println(findWord);
				}
			}else if(check.equals("exit")) {
			
				System.out.println("종료합니다...");
				break;
			}else {
				System.out.println("잘 못 입력하셨습니다.");
				continue;
			}
				
		}
		sc.close();

	}

}
