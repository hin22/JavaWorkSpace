package ch12_collection.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listArray = new ArrayList<>();
		List<String> listLinkedList = new LinkedList<>();
		
		ArrayList<String> ar = new ArrayList<>();
		LinkedList<String> lkList = new LinkedList<>();
		
		long startTime, endTime;
		
		startTime = System.nanoTime(); //현재 시간을 나노초로 변환해서 반환
		for(int i=0; i<10000; i++) {
			listArray.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("listArray 걸린시간 : " + (endTime-startTime));
		
		startTime = System.nanoTime(); //현재 시간을 나노초로 변환해서 반환
		for(int i=0; i<10000; i++) {
			listLinkedList.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("listLinkedList 걸린시간 : " + (endTime-startTime));
		
		System.out.println("------------------");
		
		startTime = System.nanoTime(); //현재 시간을 나노초로 변환해서 반환
		for(int i=0; i<10000; i++) {
			ar.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ar 걸린시간 : " + (endTime-startTime));
		
		startTime = System.nanoTime(); //현재 시간을 나노초로 변환해서 반환
		for(int i=0; i<10000; i++) {
			lkList.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("lkList 걸린시간 : " + (endTime-startTime));
	}

}
