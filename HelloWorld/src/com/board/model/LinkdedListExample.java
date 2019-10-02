package com.board.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkdedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		long startTime, endTime;
		startTime = System.nanoTime();
		endTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
//			list1.add(0, String.valueOf(i));
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간은: " + (endTime - startTime));
		System.out.println("LinkedList");

		for (int i = 0; i < 100000; i++) {
//			list2.add(0, String.valueOf(i));
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간은: " + (endTime - startTime));
	}
}
