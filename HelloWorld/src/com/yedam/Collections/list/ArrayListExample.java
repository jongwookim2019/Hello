package com.yedam.Collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample { //멀티쓰레드
	public static void main(String[] args) {
		// List 인터페이스를 구현하는 ArrayList 클래스.
		List<String> list = new ArrayList<>(); // new String[10];
		list.add("Hello");
		list.add("World");
		list.add("Nice");
		list.add("Java");
		list.add(2, "Insert");
		int size = list.size();
		System.out.println("객체수는 : " + size);
		for (int i = 0; i < size; i++) {
			System.out.println("index: " + i + " >> "+list.get(i));
		}
		String returnVal = list.remove(2);
		System.out.println("retrun: " +returnVal);
		for (String str : list) {
			System.out.println(str);
		}
	}
}
